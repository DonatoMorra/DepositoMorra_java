import java.sql.*;
import java.util.Scanner;

public class Esercizio3 
{
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/sakila";
        String user="root";
        String psw="";
        

        Scanner mystr= new  Scanner(System.in);
        Scanner myint= new  Scanner(System.in);
        boolean continua=true;


        try 
        {   

            Connection conn= DriverManager.getConnection(url,user,psw);

    
        while(continua)
        {   

                System.out.println("--Menu--");
                System.out.println("1 - Visualizza Studenti");
                System.out.println("2 - Aggiungi voti");
                System.out.println("3 - Aggiungi studenti");
                System.out.println("4 - Modifica");
                System.out.println("5 - Elimina");
                System.out.println("6 - esci");

                System.out.println("Cosa vuoi fare?: ");
                int scelta = mystr.nextInt();

              

        switch (scelta) {
            case 1:
                System.out.println("Viualizza");    

                //inserire la query di per visualizzare Studenti

                String Viusalizza_studenti = "";
                
                

                


                conn.close();
                break;

            case 2: 
                    //inserire query aggiunta voti
                 String aggiunta_voti = "";
                PreparedStatement agg_vot = conn.prepareStatement(aggiunta_voti);


                conn.close();
                break;
            case 3:

                //aggiunta nuovi studenti
                String aggiunta_nuovi_studenti = "";
                PreparedStatement agg_st = conn.prepareStatement(aggiunta_nuovi_studenti);

                conn.close();
                break;
            case 4:

                    // scelta se vuole modificare lo studente o il voto   
                System.out.println(" --Menu-- ");
                System.out.println("1 - Studente");
                System.out.println("2 - Voto");
                System.out.println("3 - esci");
                

                    System.out.println("Cosa vuoi modificare");
                    int scelta1= myint.nextInt();
                    boolean cont=true;
            
                while (cont) { 
                    switch (scelta1) 
                    {
                        case 1:
                                   // modifica studente
                                String mod_studente = "";
                                 PreparedStatement mod1 = conn.prepareStatement(mod_studente);

                                 conn.close();

                            break;
                        
                        case 2: 
                                 // modifica voto
                                 String mod_voto = "";
                                 PreparedStatement mod2 = conn.prepareStatement(mod_voto);

                                 conn.close();
                            break;


                        case 3:
                            // esci
                                cont=false;
                            break;

                        default:
                            System.out.println("caso non esiste");
                    }
                }

 


                break;
             case 5:
                        // scelta se vuole Eliminare lo studente o il voto

                    System.out.println("--Menu--");
                    System.out.println("1 - Studente");
                    System.out.println("2 - Voto");
                    System.out.println("3 - esci");
                

                    System.out.println("Cosa vuoi eliminare");
                    int scelta2= myint.nextInt();
                    boolean conti=true;
        
                while (conti) { 
                    switch (scelta2) 
                    {
                        case 1:
                                // elimina studente 
                                String elimi_studente = "";
                                 PreparedStatement canc = conn.prepareStatement(elimi_studente);

                                 conn.close();
                            break;
                        
                        case 2: 
                                // elimina voto
                                  String elimi_voto = "";
                                 PreparedStatement canc1 = conn.prepareStatement(elimi_voto);

                                 conn.close();
                            break;

                        case 3:
                                //esci
                            conti=false;
                            break;

                        default:
                            System.out.println("caso non esiste");
                    }
                }
                break;

            case 6:

                    // addio amico addio
                    System.out.println("esci");
                break;
            
            
            default:
                System.out.println("caso non esiste");
        }
        }

             conn.close();
        } 
        catch (Exception e)
        {
                e.printStackTrace();
        }

    }



}
