package Mattina;
import java.util.Scanner;

public class Esercizio_for {
    public static void main(String[] args) {
        
        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        int votovalido=0;
    
        System.out.println("Inserisci quanti voti vuoi inserire (numero intero)");
        int numero=myint.nextInt();

        //se il numero e minore a 0
        while(numero<0)
        {
            System.out.println("il numero deve essere maggiore di 0");
            numero=myint.nextInt();
        }

    
        for(int i=0; i<numero; i++)
            {
                votovalido++;
                System.out.println("inserisci voto: "+i);
                int vot=myint.nextInt();

                //se maggiore uguale a 18 o minore a 24
                if(vot>=18 && vot<24)
                {
                    System.out.println("Sufficiente");
                    
                }
                //se maggiore uguale 24
                else if(vot>=24)
                {
                    System.out.println("Buono o Ottimo");        
                }
                //se minore di 18
                else if(vot<18)
                {
                    System.out.println("insufficiente");    
                }

                //se maggiore di 30 
                else if(vot>30)
                {
                    System.out.println("Voto non valido");
                }

                //tot di numeri validi inseriti
            } 
            System.out.println("Numero totale di voti validi inseriti "+votovalido);

        }
    }
    

