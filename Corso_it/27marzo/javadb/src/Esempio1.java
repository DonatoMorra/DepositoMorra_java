import  java.sql.*;

public class Esempio1
 {
    public static void main(String[] args) 
    {
        String url="jdbc:mysql://localhost:3306/sakila";
        String user="root";
        String psw="";

        try 
        {
            //connesione al db
            Connection conn= DriverManager.getConnection(url,user,psw);
            
            
            //connettore del db
            Statement stmt = conn.createStatement();

           
            //creamo una query
            String query="select * from actor limit 5";
        

            //risultato di una query
            ResultSet result = stmt.executeQuery(query);
            //System.out.println(result);
            

            ResultSetMetaData meta = result.getMetaData();
            int numColum=meta.getColumnCount();

            while (result.next()) 
            { 
                // cicla per il numero delle colonne
                for (int i = 1; i<numColum; i++)
            {
                //partiamo dalla prima colonna
                String colName= meta.getColumnName(i);

                //non sapendo il valore facciamo object
                Object val= result.getObject(i);

                //stampa nome di colonna e valore
                System.out.print(colName + ": "+val);

                // stampa il separatore quando i e minore di numColum
                if(i<numColum)
                {
                    System.out.print("|");
                }

            }
                    System.out.println();
            }
            // chiudiamo la connessione 
            conn.close();
            System.out.println("connesione chiusa");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();


        }

        
    }
    
}
