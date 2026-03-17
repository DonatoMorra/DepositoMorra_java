import java.util.Scanner;

public class Esercizi_condizioni
{
    public static void main(String[] args) 
    {
        //esercizio 1
        //chiamo lo scanner
        Scanner sc=new Scanner(System.in);

        System.out.println("inserisci un numero intero: ");

        //inserisce il numero l'utente
        int num=sc.nextInt();

        //se il numero e positivo di 0
        if(num>0)
        {
            System.out.println("il numero e positivo");
        }
         //se il numero e negativo di 0
        else if(num<0)
        {
            System.out.println("il numero e negativo");
        }
         //altrimenti il numero e 0
        else
        {
            System.out.println("il numero e 0");
        }
        

        //esercizio 2

        //facio inserire ad l'utente il primo numero
        System.out.println("inserisci il primo numero intero: ");

        //inserisce il numero l'utente
        int num1=sc.nextInt();

        //facio inserire ad l'utente il primo numero
         System.out.println("inserisci il secondo numero intero: ");

         //inserisce il numero l'utente
         int num2=sc.nextInt();

        //se num1 e maggiore di num2 
         if(num1>num2)
         {
            System.out.println("il primo numero e maggiore");
         }
         //se num1 e minore di num2 
         else if(num1<num2)
         {
             System.out.println("il primo numero e minore");
         }
         //se num1 e uguale di num2 
         else
         {
            System.out.println("i numeri sono uguali");
         }

        //esercizio 3 

         //chiedo ad l'utente di inserire la propria età
        System.out.println("inserisci la propria età: ");
        int eta=sc.nextInt();

        //se l'età e minore di 18
        if(eta<18)
        {
            System.out.println("sei minorenne");
        }
        //se l'età e maggiore di 18
        else if(eta>=18)
        {
            System.out.println("sei maggiorenne");
        }
        //se le due condizioni non sono vere
        else
        {
            System.out.println("non esisti");
        }

        //esercizio 4 

        //chiedo all'utente di inserire anno
        System.out.println("inseisci un anno: ");
        int anno=sc.nextInt();
        
        if(anno%4==0 && anno%400==0)
        {
            System.out.println("Anno bisestile");
        }
        else
        {
            System.out.println("Anno non bisestile");
        }



        int day = 4;
                switch (day) {
                    case 1:
                    System.out.println("Monday");
                    break;
                    case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                    System.out.println("Wednesday");
                    break;
                    case 4:
                    System.out.println("Thursday");
                    break;
                    case 5:
                    System.out.println("Friday");
                    break;
                    case 6:
                    System.out.println("Saturday");
                    break;
                    case 7:
                    System.out.println("Sunday");
                    break;}


    System.out.println("Inserisci nome: ");
        String nome=sc.nextLine();

        
        System.out.println("Inserisci cognome: ");
        String cognome=sc.nextLine();

        
        System.out.println("Inserisci password: ");
        String password=sc.nextLine();

        
        System.out.println("Voi modificare qualcosa: ");
        String risposta=sc.nextLine();

        if(risposta.equals("si") || risposta.equals("s"))
{
        System.out.println("cosa vuoi modificare?: ");
        System.out.println("1: nome \n 2:cognome \n 3: passowrd");
        int scelta=sc.nextInt();
        switch (scelta) 
        {
            case 1:
                 System.out.println("Inserisci nome: ");
                int nome1=sc.nextInt();

                System.out.println("ecco i tuoi dati modificati: " + "nome: "+nome1 +" cognome: "+ cognome +"Password: "+ password);

                break;
            case 2:
              System.out.println("Inserisci cognome: ");
            int cognome1=sc.nextInt();
                System.out.println("ecco i tuoi dati modificati: " + "nome: "+nome +" cognome: "+ cognome1 +"Password: "+ password);
                break;
            case 3:
                 System.out.println("Inserisci password: ");
                 int password1=sc.nextInt();
                 System.out.println("ecco i tuoi dati modificati: " + "nome: "+nome +" cognome: "+ cognome +"Password: "+ password1);

            default:
                throw new AssertionError();
        }

    }
    else
    {
        System.out.println("Arrivederci");
    }
    }
}
