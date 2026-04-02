package esempi_package.fabbrica_main;
import java.util.Scanner;
import esempi_package.fabbrica_produzione.Macchina;
import esempi_package.fabbrica_personale.*;
public class Main
{
        public static void main(String[] args) 
        {
                Scanner myint=new Scanner(System.in);
                Scanner mystr=new Scanner(System.in);
                
        Macchina m1 = new Macchina("Motosega", false);
        Operaio op=new Operaio("Bob");
        OperaioSpeciale ops = new OperaioSpeciale("Sam");
        OperaioDirigente opd = new OperaioDirigente("Tod");

                boolean continua=true;

                while (continua) 
                {
                        System.out.println("--- Menu Fabbrica ---");
                        System.out.println("1 - OperaioSpecial crea prodotto");
                        System.out.println("2 - OperaioDirigente controlla stato macchina");
                        System.out.println("3 - Operaio spegne macchina");
                        System.out.println("4 - Operaio accende macchina");
                        System.out.println("5 - Esci");

                        System.out.println("Cosa vuoi fare?: ");
                        int scelta=myint.nextInt();
                        
                         switch(scelta) {
                case 1:
                    ops.creaProdotto(m1);
                    break;
                case 2:
                    opd.stampaStato(m1);
                    break;
                case 3:
                    op.Ferma(m1);
                    break;
                case 4:
                    op.Lavora(m1);
                    break;
                case 5:
                    System.out.println("Arrivederci");
                    continua=false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }


                    
                }




        }
}
// errore di pagkage