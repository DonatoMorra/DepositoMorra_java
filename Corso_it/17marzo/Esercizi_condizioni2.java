
import java.util.Scanner;

public class Esercizi_condizioni2 {
    public static void main(String[] args) {
            //Scanner str
        Scanner mystr=new Scanner(System.in);
            //Scanner int
        Scanner myint=new Scanner(System.in);
        
        //esercizio 1
       
        //Inserisce nome utente
        System.out.println("Inserisci Username: ");
        String nome=mystr.nextLine();

        //entra se e vuota la stringa
        if(nome.isEmpty())
        {
            System.out.println("Username non valido");

        }
        //entra se e minore di 5 
        else if(nome.length()<5)
        {
            System.out.println("Username troppo corto");
        }
         //entra se e maggiore o uguale a 5 
        else if(nome.length()>=5)
        {
            System.out.println("Username valido");
        }

            //esercizio 2

        //Inserisce nome Username
        System.out.println("Inserisci Username: ");
        String username=mystr.nextLine();
        
        //Inserisce nome Password
        System.out.println("Inserisci Password: ");
        String psw=mystr.nextLine();


        if ((username.equals("admin") && ((psw.equals("1234")))))
        {
            System.out.println("Accesso consentito");
        }
        else
        {
             System.out.println("Credenziali errate");
                System.out.println("Accesso negato");
        }

            //esercizio 3

            //inserisci codice sconto
            System.out.println("Inserisci codice sconto: ");
            String sconto= mystr.nextLine().toUpperCase();

            // totale spesa
            System.out.println("Inserisci totale spesa: ");
            int tot=myint.nextInt();

            //conversione casting da int a double
            double dtot=tot;
            
            //se lo sconto codice sconto e uguale allora entra 
            if (sconto.equals("SCONTO10"))
            {
                System.out.println("Sconto del 10%");
                System.out.println("Prezzo è: "+(dtot-(dtot*10)/100));
            }
            //se lo sconto codice sconto e uguale allora entra 
            else if (sconto.equals("SCONTO20"))
            {
                System.out.println("Sconto del 20%");
                System.out.println("Prezzo è: "+(dtot-(dtot*20)/100));
            }
            //se lo sconto codice sconto e uguale allora entra ma non solo deve anche avere l'iporto della spesa superiore a 100
             else if (sconto.equals("VIP") && tot>100)
             {
                System.out.println("Sconto del 30%");
                System.out.println("Prezzo è: "+(dtot-(dtot*30)/100));
             }
             //se non mette nessun codice
             else if (sconto.isEmpty())
             {
                System.out.println("Non hai inserito nessun codice");
             }
             //se il codice non si trova con quelli scitti dice codice non valido
             else
             {
                System.out.println("Codice non valido");
             }


            }
    
}
