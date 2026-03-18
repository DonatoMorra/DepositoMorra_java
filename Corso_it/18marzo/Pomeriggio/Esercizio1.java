
import java.util.Scanner;

//non completo SBAGLIATO

public class Esercizio1 {
    public static void main(String[] args) {
        
        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        double saldo=10;


        System.out.println("Saldo iniziale: "+saldo+" euro");

          System.out.println("---Menu---");
                     System.out.println("Caffè "+"-"+ 1.50+" euro");
                     System.out.println("Cappuccino "+"-"+ 2.00+" euro");
                     System.out.println("Tè"+"-"+ 1.00+" euro");
                    System.out.println("Acqua "+"-"+ 0.50+" euro");


        System.out.println("Inserisci 1 se vuoi comprare 0 per uscire");
        int scelta=mystr.nextInt();
        


        switch (scelta) {
            case 1:
                   

                 System.out.println("Cosa vuoi comprare?: ");
                    String acquisto=mystr.nextLine().toLowerCase();

                    if(acquisto.equals("caffe"))
                    {
                        System.out.println("Hai acquistato caffe");
                       System.out.println("il tuo saldo attuale è: " +(saldo-1.50));

                        
                    }
                    else if(acquisto.equals("cappuccino"))
                    {
                        System.out.println("Hai acquistato Cappuccino");
                       System.out.println("il tuo saldo attuale è: " +(saldo-2.00));
                    }
                    else if(acquisto.equals("Te"))
                    {

                        System.out.println("Hai acquistato Tè");
                       System.out.println("il tuo saldo attuale è: " +(saldo-1.00));
                    }
                    else if(acquisto.equals("Acqua"))
                    {   

                        System.out.println("Hai acquistato Acqua");
                       System.out.println("il tuo saldo attuale è: " +(saldo-0.50));

                    }
                    else
                    {
                        System.out.println("la bevanda che tu hai inserito non esiste");
                    }

                    System.out.println("Vuoi prendere un altro prodotto? (s/n)");
                    String risposta=mystr.nextLine();
                    if(risposta.equals("s"))
                    {

                    }
                    else
                    {
                        System.out.println("Arrivederci");
                        break;
                    }
     
                      case 0:
                    System.out.println("Arrivederci");
        
         
        }

    }
    
}
