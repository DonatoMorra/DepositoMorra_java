import  java.sql.*;

public class DatabaseConnection
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
            System.out.println("Connessione andata a buon fine!");
            
            //connettore del db
            Statement stmt = conn.createStatement();

           
            //creamo una query
            String query="select first_name from actor limit 5";
        

            //risultato di una query
            ResultSet result = stmt.executeQuery(query);
            //System.out.println(result);
            
            //Cicliamo e vediamo tutti i dati della colonna che ci interessa 
            while (result.next()) 
            {                                                               //o passiamo l'etichetta o l'indice
                System.out.println("Attore: "+result.getString("first_name"));
                
                
            }
           

            
            



            conn.close();
            System.out.println("Configurazione di JDBC ok!");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();


        }

        
    }
    
}
