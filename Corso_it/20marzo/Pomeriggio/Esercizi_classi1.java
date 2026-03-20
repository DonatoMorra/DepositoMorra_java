public class Esercizi_classi1
{
    public static void main(String[] args) 
    {

        libro lib = new libro("Lupin |||","Giorgio",50);       
        libro lib1= new libro("Nino Frassica", "Nino Frassica", 300);

         lib.mostraInfo();
         lib1.mostraInfo();

        
        
    }
}

class libro
{
    String libro;
    String autore;
    double prezzo;
    static int codice_numerico_autoincrementante=0;

    //costruttore
    libro(String libro,String autore,double  prezzo) 
    {
        //assegno i valori
        this.libro=libro;
        this.autore=autore;
        this.prezzo=prezzo;
        codice_numerico_autoincrementante++;

    }

    void mostraInfo()
    {
        System.out.println(this.libro +" - " + this.autore + " - "+" - "+this.prezzo +" €");
        System.out.println("-----------------------------");
    }


}