
import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio_Biblioteca 
{
    public static void main(String[] args) {
        
        
        boolean continua = true;
        //scanner
        Scanner mystr=new Scanner(System.in);
        Scanner myint=new Scanner(System.in);
        
        //creo arraylist 
        ArrayList<Book> books =new ArrayList<>();
        
       libreria lib=new libreria();



        while (continua) 
        {   


            //Menu
            System.out.println("--Menu--");
            System.out.println("1 - Aggiungi libro");
            System.out.println("2 - Prendi un libro");
            System.out.println("3 - mostra libro");
            System.out.println("4 - Esci");

                //scelta dell'utente

                System.out.println("Cosa vuoi fare?: ");
                int scelta=myint.nextInt();

            switch (scelta) {
                case 1:

                        System.out.println("Inserisci il titolo: ");
                        String tit=mystr.nextLine();
                        
                        System.out.println("inserisci autore: ");
                        String aut=mystr.nextLine();


                        Book book=new Book(tit, aut,true);
                        lib.aggiungilibro(book);

                        System.out.println("Libro aggiunto");
                       
                    break;

                case 2:
                                
                        System.out.println("Quale libro vuoi prendere?: ");

                        String prendi=myint.nextLine();

                        lib.prendiinprestito(prendi);
                    break;
                    
                case 3:
                        lib.mostraLibri();
                    break;

                    //arrivederci
                case 4:
                System.out.println("Arrivederci ");
                        continua=false;
                    break;


                default:
                    System.out.println("Scelta non valida");
            }
            
        }

        myint.close();
        mystr.close();

    }
    
}

class Book
{
    String titolo;
    String autore;
    boolean diponibilia;

    public Book(String titolo,String autore,boolean diponibilia) 
    {
        this.titolo=titolo;
        this.autore=autore;
        this.diponibilia=diponibilia;
    }
      
    public String toString() {
        return "Titolo: " + titolo + ", Autore: " + autore +", Disponibilita: "+diponibilia ;
    }



}

class libreria
{
    ArrayList<Book> books= new ArrayList<>();

    void aggiungilibro(Book book)
    {
            books.add(book);
    }
    void mostraLibri()
    {
         if(books.isEmpty())
    {
        System.out.println("Non esiste nessun libro");
    }
    else
    {
             for (Book b: books)
                 {
                System.out.println(b);
                }

    }
    }

    void prendiinprestito(String titolo) {
    boolean trovato = false;

    for (Book b : books) {
        if (b.titolo.equalsIgnoreCase(titolo)) {
            trovato = true;
            if (b.diponibilia) {
                b.diponibilia = false;
                System.out.println("Libro preso in prestito: " + b.titolo + " " + b.autore);
            } else {
                System.out.println("Libro non disponibile");
            }
            break; // esci dal ciclo dopo aver trovato il libro
        }
    }

    if (!trovato) {
        System.out.println("Il libro non è presente in biblioteca");
    }
}
}
   

    
    




