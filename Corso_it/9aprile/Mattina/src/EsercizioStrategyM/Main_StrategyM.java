package EsercizioStrategyM;

import java.util.Scanner;

public class Main_StrategyM 
{
    public static void main(String[] args) {
        
        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        MetodoPagamento carta=new CartaDiCredito();
        MetodoPagamento paypal=new Paypal();

        boolean continua=true;

        while (continua) 
        {   
            System.out.println("Come vuoi pagare?");
            System.out.println("1. Carta di credito");
            System.out.println("2. PayPal");
            System.out.println("3. Esci");

            int scelta=myint.nextInt();

            switch (scelta) 
            {
                case 1:
                    PagamentoContext pagaC=new PagamentoContext(carta);
                    System.out.println("Inserisci l'importo da pagare:");
                    double importo=myint.nextDouble();
                    pagaC.eseguiPagamento(importo);
                    break;
                case 2:
                
                    PagamentoContext pagaP=new PagamentoContext(paypal);
                    System.out.println("Inserisci l'importo da pagare:");
                    double importo2=myint.nextDouble();
                    pagaP.eseguiPagamento(importo2);
                    break;
                case 3:
                    continua=false;
                default:
                    System.out.println("Caso non trovato");
            } 
            
        }

        myint.close();
        mystr.close();  
    }
    
}
