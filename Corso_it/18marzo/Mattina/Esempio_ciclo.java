package Mattina;

import java.util.Scanner;

public class Esempio_ciclo {
    public static void main(String[] args) {
        int i=1;
        //inizializzazione della variabile di controllo
        
        while(i<=5)
        {
            i++;//incremento della variabile di controllo
            System.out.println(i);
        }


        Scanner scanner=new Scanner(System.in);

        boolean continua=true; //variabile di controllo del ciclo

        while(continua)
        {
            System.out.println("Inserisci un numero(0 per uscire)");
            int numero=scanner.nextInt();

            if(numero==0)
            {
                continua=false; //rompe il ciclo
            }
            else
            {
                System.out.println("hai inserito "+numero);
            }
        }
        System.out.println("Programma terminato");
        scanner.close();

        Scanner myint=new Scanner(System.in);

        int num;

        //ciclo do while che tipete almeno una volta
        do
        {
          System.out.println("Inserisci un numero (0 per uscire): ");
          num=myint.nextInt();  
        }

        while(num !=0);
        System.out.println("hai inserito 0. Programma terminato");


    }
    
}
