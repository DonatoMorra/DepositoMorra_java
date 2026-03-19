import java.util.ArrayList;
import java.util.Scanner;

public class Esercizi_arrayList2 {
    public static void main(String[] args) 
    {

         Scanner mystr=new Scanner(System.in);
         Scanner myint=new Scanner(System.in);

         ArrayList<String> nomi =new ArrayList<>();

        boolean continua=true;
        while (continua) 
        {   
                //Menu
            
                System.out.println("\n---Menu---");
                System.out.println("1 - Aggiungi nome");
                System.out.println("2 - Visualizza tutti i nomi");
                System.out.println("3 - Cerca nome");
                System.out.println("4 - Rimuovi nome");
                System.out.println("5 - Esci\n");

                System.out.println("Seleziona un numero su cosa vuoi fare: ");
                int num=myint.nextInt();
                

                switch (num) {
                    case 1:
                       boolean cont=true;
                    while(cont)
                    {
                            //utente inserisce nome 
                        System.out.println("Inserisci un nome" + " Fine per non inserire altri nomi");

                        String nome=mystr.nextLine();

                        nomi.add(nome);
                        
                        //se la parola e fine esce dal inserire nome e la parola fine viene cancellata dalla lista
                        if(nome.equalsIgnoreCase("fine"))
                    {
                        nomi.remove("fine");
                        cont=false;
                             break;
                    }  
                    }
                        break;

                case 2: 

                       
                    
                    if(nomi.isEmpty())
                    {
                        System.out.println("Lista vuota");
                    }
                    else
                    {
                         System.out.println("Nomi " + nomi);
                    }
                        break;
                case 3:
                        //cerca nome

                        System.out.println("Quale nome vuoi cercare?: ");
                        String cerca=mystr.nextLine();

                        if(nomi.contains(cerca))
                        {
                         System.out.println("Nome trovato");
                        }
                        else
                        {
                            System.out.println("Nome non trovato");
                        }
                       break;
                    
                case 4: 
                            //rimuove nome
                            System.out.println("Quale nome vuoi rimuovere?: ");
                            System.out.println(nomi);

                            String rimuovi=mystr.nextLine();

                            if(nomi.isEmpty())
                            {
                                System.out.println("Lista vuota");
                            }

                            if(nomi.remove(rimuovi))
                                {
                                     System.out.println("Nome rimosso");
                                }
                            else 
                                 {
                                System.out.println("Nome non presente");
                                 }

                        break;
                case 5:
                //Saluto romano
                        System.out.println("Arrivederci");
                        continua=false;
                        break;
                        //se tra i segueni numeri non ce il caso va in default
                    default:
                        System.out.println("Numero inserito non valido");
                        
                }

            
        }

    }
    
}
