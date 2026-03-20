
import java.util.Scanner;

public class Esercizi_classi3 
{
    public static void main(String[] args)
   {    
    //Scanner
    Scanner myint=new Scanner(System.in);
     Scanner mystr=new Scanner(System.in);
     //creo aggetto vec 
    Veicolo vec = new Veicolo();
    
    boolean continua=true;

    while(continua)
    {   
        //Menu classico
        System.out.println("---Menu---");
        System.out.println("1 - Inserisci dati veicolo");
        System.out.println("2 - Visualizza veicolo");
        System.out.println("3 - modifica prezzo");
        System.out.println("4 - verifica età veicolo");
        System.out.println("5 - esci");

        System.out.println("Scegli opzione");
        int op=myint.nextInt();
        switch (op) 
        {   
            //Inserico dati del veicolo
            case 1:
                    System.out.println("Dimmi marca: ");
                    vec.marca=mystr.nextLine();
                                   
                    System.out.println("Dimmi modello: ");
                    vec.modello=mystr.nextLine();
                    

                    System.out.println("Che anno è: ");
                    vec.anno=myint.nextInt();
                    

                    System.out.println("Dimmi prezzo: ");
                    vec.prezzo=myint.nextDouble();
                   
                    System.out.println("Veicolo Inserito");
                break;
            case 2:
                        //Metodo nella classe Veicolo
                   vec.visualizzaVeicolo();

                   //Se vicolo non trovato
                    if(vec.marca.isEmpty() || vec.modello.isEmpty() || vec.anno==0 || vec.prezzo==0)
                    {
                        System.out.println("Veicolo non inserito");
                        break;
                    }
                    
                    

                break;

            case 3:
                    //Aggiorno prezzo ma se == 0 esce dal inserire il prezzo ed il prezzo non viene cambiato
                    System.out.println("Prezzo: "+vec.prezzo);
                    System.out.println("inserisci nuovo prezzo: ");
                    vec.prezzo=myint.nextInt();
                    if (vec.prezzo==0)
                    {
                        System.out.println("Errore Prezzo non valido");
                        break;
                    }
                    else{
                        System.out.println("Prezzo aggiornato");
                        break;
                    }
                    
                   

            case 4:     

                    //Controllo se in base anno auto
                    vec.visualizzaVeicolo();
                    if (vec.anno<=2001)
                    {
                        System.out.println("Veicolo vecchio");
                    }
                    else if(vec.anno<=2002 && vec.anno<=2021)
                    {
                        System.out.println("Usato");
                    }
                    else if(vec.anno>=2022)
                    {
                        System.out.println("Nuovo");
                    }

                break;
            case 5:     
                    //Ciao
                     System.out.println("Arrivederci");
                    continua=false;
                break;
            default:
                System.out.println("Caso non trovato");
        }

    }




        
    }
}



