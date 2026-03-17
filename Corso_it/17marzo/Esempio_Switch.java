
import java.util.Scanner;

public class Esempio_Switch {
    public static void main(String[] args) {
        
        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);


        //faccio vedere all'utente cosa puo scegliere
        System.out.println("---Menu---");
        System.out.println("1- Visualizza profilo");
        System.out.println("2- modifica nome");
        System.out.println("3- logout");

        //utente sceglie
        System.out.println("Inserisci un numero su cosa vuoi fare: ");
        int scelta=myint.nextInt();

        //entro nello switch
        switch (scelta) 
        {
            //caso 1 
            case 1:
                System.out.println("Profilo utente visualizzato");
                break;
            //caso 2
            case 2:
                System.out.println("inserisci nuovo nome: ");
                String nome=mystr.nextLine();
                System.out.println("Nome aggiornato");
                System.out.println("Ora il tuo nome è: "+nome);

                System.out.println("Vuoi aggiornare anche l'età?: ");
                String risposta=mystr.nextLine().toLowerCase();

                if (risposta.equals("si"))
                {
                    System.out.println("dammi l'età");
                    int newetà=myint.nextInt();
                }
            
                else
                {
                    System.out.println("Ciao");
                }
                break;
            //caso 3
            case 3:
                System.out.println("Logout effettuato");
                break;

            default:
                System.out.println("Scelta non valida");
            
            
        }

        myint.close();
        mystr.close();

    }
    
}
