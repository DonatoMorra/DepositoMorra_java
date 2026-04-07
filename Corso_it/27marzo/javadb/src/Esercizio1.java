import java.sql.*;

public class Esercizio1 {
    public static void main(String[] args) {
        

        String url="jdbc:mysql://localhost:3306/sakila";
        String user="root";
        String psw="";

        try 
        {   
            Connection conn= DriverManager.getConnection(url,user,psw);
            Statement stmt = conn.createStatement();

             String query = "select film.title, count(*) as noleggi_totali " +
                            "from rental " +
                            "join inventory on rental.inventory_id = inventory.inventory_id " +
                            "join film on inventory.film_id = film.film_id " +
                            "group by film.title " +
                            "order by noleggi_totali desc " +
                            "limit 10";

            ResultSet result = stmt.executeQuery(query);

            while (result.next()) 
            {
                System.out.println(""+result.getString(1));
                
            }
           

          
            
            conn.close();
        } 
        catch (Exception e)
        {
                e.printStackTrace();
        }



    }
    
}
//Recuperare i 10 film più noleggiati dalla tabella rental.