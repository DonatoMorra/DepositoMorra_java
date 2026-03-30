import java.sql.*;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        /*Creare un programma che chieda
            all'utente di inserire una stringa (es."ACADEMY"). Il programma deve restituire l'elenco
            di tutti i film che contengono quella stringa nel
            titolo, mostrando: Titolo, Descrizione e Anno di
            rilascio.
         */

         
         String url="jdbc:mysql://localhost:3306/sakila";
        String user="root";
        String psw="";

            Scanner mystr= new Scanner(System.in);

            System.out.println("Insierisci il titolo di un film");
            String titolo=mystr.nextLine();

              String query = "select film.title , film.description , film.release_year " +
                            "from film " +
                            "where title like ?";

        try 
        {   

            Connection conn= DriverManager.getConnection(url,user,psw);
            PreparedStatement pstmt = conn.prepareStatement(query);

           
            pstmt.setString(1, "%"+titolo+"%");                

            ResultSet result = pstmt.executeQuery();

            while (result.next()) 
            {
                System.out.println("Titolo: "+result.getString(1));
                
            }
           

          
            
            conn.close();
        } 
        catch (Exception e)
        {
                e.printStackTrace();
        }



    }
    
}



   
    

