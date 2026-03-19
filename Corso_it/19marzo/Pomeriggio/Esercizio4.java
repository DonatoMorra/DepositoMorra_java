
import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args)
    {

        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        ArrayList <Integer> voti =new ArrayList();
         

        boolean continua=true;
        int somma=0;

        //utente chiede quanti voti
        System.out.println("quanti voti vuoi inserire");
        int n=myint.nextInt();

        //inserisco i voti
        for (int i = 0; i < n; i++) 
        {
             System.out.println("Dimmi voto "+i  +":");
                 int inizivoto=myint.nextInt();
                 voti.add(n);
                 somma+=inizivoto;
        }


        while(continua)
    {
        
       
            //menu classico

            System.out.println("--Menu--");
            System.out.println("1 - media");
            System.out.println("2 - max");
            System.out.println("3 - min");
            System.out.println("4 - promozione");
            System.out.println("5 - Esci");

               System.out.println("Quale operazione disideri fare?: ");
                int op=myint.nextInt();

                int media =calcolaMedia(somma,voti.size());

            switch (op) 
            {
                    
                case 1:      
                        System.out.println("Media: "+media);
                case 2:
                        
                       //mostra voto piu alto
                   
                case 3:
                        //mostra voto piu basso
                       
                    
                case 4:
                    //se la media e maggiore o uguale a 6 promosso altrimenti bocciato

                            if(media>=6)
                            {
                                System.out.println("Promosso");
                            }
                            else
                            {
                                System.out.println("Bocciato");
                            }


                        break;
                    //esci
                case 5:
                        System.out.println("Arrivederci");
                        continua=false;
                        break;

                default:
                        //se utente mette case non esistente
                        System.out.println("Numero non valido");
            }
       

    }


    }
    //calcolo media
     static int  calcolaMedia(int somma,int numeroVoti)
        {
            return somma/numeroVoti;
        }
        

    //trova numero massimo
    static int trovaMax(int max)
    {

      

        return max;
    }
    //trova numero minimo
     static int trovaMin(int min)
    {

      

        return min;
    }

   
    
}
