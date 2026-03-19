import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {


            Scanner myint=new Scanner(System.in);
            Scanner mystr=new Scanner(System.in);

            boolean continua=true;

            System.out.println("Inserisci 1 numero: ");
            int num1=myint.nextInt();

            System.out.println("Inserisci 2 numero: ");
            int num2=myint.nextInt();

        
        while (continua) 
        {   
           //menu classico

             System.out.println("--Menu--");
            System.out.println("1 - Somma");
            System.out.println("2 - Sottrazione");
            System.out.println("3 - moltiplicazione");
            System.out.println("4 - Divisione");
            System.out.println("5 - Esci");

            //Utente sceglie operazione
            System.out.println("Quale operazione disideri fare?: ");
            int op=myint.nextInt();


            switch (op) 
            {

                case 1:
                    System.out.println("La somma è: "+somma(num1, num2));
                        break;

                case 2:
                        System.out.println("La Sottrazione è: "+sottrazione(num1, num2));
                        break;
                    
                case 3:
                        System.out.println("La moltiplicazione è: "+moltiplicazione(num1, num2));
                        break;

                case 4:
                        System.out.println("La Divisione è: "+divisione(num1, num2));
                        break;
                case 5:
                        System.out.println("Arrivederci");
                        continua=false;
                        break;

                default:
                        System.out.println("Numero non valido");
            }
            //se l'utente scrive 5 esce dal ciclo
           

            

        }

    }

    //metodo somma
    static int somma(int a, int b)
    {
        return a+b;
    }

    //metodo sottrazione
    static int sottrazione(int a, int b)
    {
        return a-b;
    }

    //metodo moltiplicazione
    static int moltiplicazione(int a, int b)
    {
        return a*b;
    }

    //metodo divisione
    static int divisione(int a, int b)
    {
        if(b==0)
        {
            System.out.println("Errore divisione per zero");
        }
        
        return a/b;
        
    }



    
}
