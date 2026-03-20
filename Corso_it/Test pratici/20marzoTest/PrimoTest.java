
import java.util.ArrayList;
import java.util.Scanner;

public class PrimoTest {
    public static void main(String[] args) {

        //Scanner 
        //Array
        ArrayList<String> nomi_prodotti= new ArrayList<>();
        ArrayList<Integer> quantita= new ArrayList<>();
        Scanner myint= new Scanner(System.in);
        Scanner mystr= new Scanner(System.in);


        boolean continuta=true;

        //inizio codice

        while(continuta)
        {   
            System.out.println("---Menu---");
            System.out.println("1 - Aggiungi prodotto");
            System.out.println("2 - Visualizza produzione");
            System.out.println("3 - Cerca prodotto");
            System.out.println("4 - Modifica quantità");
            System.out.println("5 - Rimuovi prodotto");
            System.out.println("6 - Calcola totale prezzo prodotto");
            System.out.println("7 - Esci");

            //utente chiede
            System.out.println("Quale operazione desideri fare?");
            int scelta=myint.nextInt();
            switch (scelta) {
                case 1:
                        boolean cont=true;
                        while (cont) { 

                             System.out.println("Aggiungi nome prodotto");
                             String prodotto=mystr.nextLine();
                             nomi_prodotti.add(prodotto);

                            if(prodotto.isEmpty())
                            {
                                System.out.println("Errore Nome vuoto");
                                cont=false;

                            }
                            System.out.println("dimmi la quantita prodotta");
                            int qua=myint.nextInt();
                            quantita.add(qua);

                            if(qua<=0)
                            {
                                System.out.println("Il prodotto non puo essere minore o uguale a 0");
                                cont=false;
                            }

                            System.out.println("Prodotto aggiunto");
                            break;
                        
                        }
                    break;
                case 2:
                        
                        if(nomi_prodotti.isEmpty())
                        {
                            System.out.println("Nessun prodotto registrato");
                            break;
                        }

                        for (int i=0; i<nomi_prodotti.size(); i++)
                        {
                             System.out.println("Prodotto: " + nomi_prodotti.get(i) + " | Quantità: "+quantita.get(i));
                        }

                       

                    break;
                case 3:

                        cerca(nomi_prodotti,quantita);
                        break;
                                      
                case 4:

                           modifica(nomi_prodotti, quantita);
                            break;

                case 5:

                           elimina(nomi_prodotti,quantita);
                                break;

                case 6:

                           System.out.println("La somma dei prodotti é: " + totprezzo(quantita));
                            break;
                    
                
                case 7:
                
                            System.out.println("Arrivederci");
                            continuta=false;

                    break;
                
                default:
                    System.out.println("Operazione non trovata");
            }

        }
    }



    static void modifica(ArrayList<String> nomi_prodotti,ArrayList<Integer> quantita)
    {
        Scanner mystr= new Scanner(System.in);
        Scanner myint= new Scanner(System.in);

         System.out.println("Quale prodotto vuoi modificare la quantita?: ");
                            String mod=mystr.nextLine();

                            for (int i=0; i<nomi_prodotti.size(); i++)
                            {
                                if(nomi_prodotti.get(i).equals(mod))
                                {
                                    System.out.println("Dimmi la nuova quantità");
                                    int newquant=myint.nextInt();

                                    newquant=quantita.get(i);
                                    System.out.println("Quantita modificata");
                                    break;

                                }
                                else
                                {
                                    System.out.println("Nome prodotto non trovato");
                                    break;
                                }

                            }
                            myint.close();
                            mystr.close();

    }



    static void cerca(ArrayList<String> nomi_prodotti,ArrayList<Integer> quantita )
    {
         Scanner mystr= new Scanner(System.in);
         System.out.println("Quale prodotto stai cercando?: ");
                        String nome_prod=mystr.nextLine();

                        for(int i=0; i<nomi_prodotti.size(); i++)
                        {
                             if(nomi_prodotti.get(i).equals(nome_prod))
                             {
                              System.out.println("Prodotto trovato: ");
                              System.out.println(nomi_prodotti.get(i));
                              break;
                              }

                        else
                        {
                            System.out.println("Prodotto non trovato");
                            break;
                        }
                        }
                    mystr.close();

    }


    static int  totprezzo(ArrayList<Integer> prodotti)
        {
            int somma=0;
            for(int i=0; i<prodotti.size(); i++)
            {
                somma += prodotti.get(i);
            }
            return somma;
        }   




    static void elimina(ArrayList<String> nomi_prodotti,ArrayList<Integer> quantita )
    {
             Scanner mystr= new Scanner(System.in);
         System.out.println("Dimmi il prodotto che vuoi eliminare");
                            String canc=mystr.nextLine();

                             for (int i=0; i<nomi_prodotti.size(); i++)
                            {
                                if(nomi_prodotti.get(i).equals(canc))
                                {
                                   nomi_prodotti.remove(canc);
                                    quantita.remove(i);
                                    System.out.println("Prodotto eliminato");
                                    break;
                                }
                                else
                                {
                                    System.out.println("Nome prodotto non trovato");
                                    break;
                                }
                            }
                            mystr.close();

    }
    
}
