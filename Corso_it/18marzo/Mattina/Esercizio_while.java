package Mattina;

import java.util.Scanner;

public class Esercizio_while {
    public static void main(String[] args) {

        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        int tentativi = 0; //inizializzo tentativo a 0
        boolean continua=true;

        

        do
        {
            //chiedo utetne di mettere la password
        System.out.println("Inserisci password");
        String psw=mystr.nextLine();

        //incremento di tentativo di 1

        tentativi+=1;
            System.out.println(tentativi);

            //se password e corretta entra 
             if(psw.equals("java123"))
        {

            System.out.println("Password corretta");
            while(continua==true)
            {
            System.out.println("Voui accedere al sistema? (s/n)");
            String risposta=mystr.nextLine();

            if(risposta.equals("s"))
            {
                System.out.println("Accesso effetuato");
                continua=false;
                tentativi=10;
                
            }
            else if(risposta.equals("n"))
            {
                System.out.println("Accesso annulato");
                continua=false;
                
            }
            else
            {
                System.out.println("inserisci s o n");
            }
            }
        }
        //Altrimenti password non corretta
        else
        {
            System.out.println("Password non corretta");
        }

        }
        while(tentativi<3);

        if(tentativi>3 && tentativi!=10)
        {
            System.out.println("Accesso bloccato");
        }
        else
        {
            System.out.println("Programma riuscito");
        }
       
        


    }
    
}
    

