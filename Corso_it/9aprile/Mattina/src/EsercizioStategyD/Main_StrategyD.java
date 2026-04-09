package EsercizioStategyD;

import java.util.Scanner;

public class Main_StrategyD
{

    public static void main(String[] args) {
        
        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        //chiamo le classi ordine centroPriorita e observer e le inizializzo a null
        Ordine ordine = null;
        CentroPriorita centro = null;
        Observer Observer = null;
            

        
        boolean continua=true;

        while (continua) 
        {
            
            //Menu
            System.out.println("--MENU--");
            System.out.println("1 - Crea ordine");
            System.out.println("2 - cambiare lo stato del centro");
            System.out.println("3 - Visualizzare i dati dell'ordine");
            System.out.println("4 - eseguire la sconto corrente");
            System.out.println("5 - non puoi uscire");

            //scelta utente
            System.out.println("Cosa vuoi fare?: ");
            int scelta = myint.nextInt();

            switch (scelta) {
                case 1:              
                    //creazione ordine
                    System.out.print("ID: ");
                    int id = myint.nextInt();

                    System.out.print("Cliente: ");
                    String cliente = mystr.nextLine();

                    System.out.print("Prodotto: ");
                    String prodotto = mystr.nextLine();

                    System.out.print("Prezzo: ");
                    double prezzo = myint.nextDouble();

                    ordine = new Ordine(id, cliente, prodotto, prezzo, new EvasioneNormale());
                    System.out.println("Ordine creato con strategia NORMALE");
                        
                    //creazione centro di priorità
                    centro = new CentroPriorita();
                    System.out.println("Centro di priorità creato");
                    
                        //creazione observer
                        Observer = new OrdineObserver(ordine);
                        centro.RegistraObserver(Observer);
                        System.out.println("Observer registrato");
                    
                    break;
                case 2:   
                    //se il centro è null non posso cambiare lo stato
                 if(centro == null)
                    {
                        System.out.println("Crea prima il centro");
                    }
                    else
                    {
                        //cambio stato del centro
                        System.out.print("Inserisci stato (normale / priorita / controllo): ");
                        String stato = mystr.nextLine();

                        centro.CambiaStato(stato);
                    }
                    break;

                case 3:         
                    //se l'ordine è null non posso visualizzare i dati
                        if(ordine == null)
                    {
                        System.out.println("Nessun ordine creato");
                    }
                    else
                    {
                        //visualizzo i dati dell'ordine
                        ordine.VisualizzaDati();
                    }
                    break;
                
                case 4:
                //se l'ordine è null non posso eseguire la strategia
                       if(ordine == null)
                    {
                        System.out.println("Nessun ordine creato");
                    }
                    else
                    {
                        //eseguo la strategia c
                        ordine.EseguiStrategy();
                    }
                    break;


                default:
                //Sei intrappolato in un loop temporale HAHAHAHAH
                    System.out.println("Ti ho detto che non puoi uscire!");
            } 
            
        }


    }
    
}
