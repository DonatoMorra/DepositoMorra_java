import java.util.ArrayList;
import java.util.Scanner;

//creo classe auto
class Auto
{
    String targa;
    String modello;

    Auto(String targa,String modello) 
    {
        this.targa=targa;
        this.modello=modello;
    }

     public String toString() {
        return "Targa: " + targa + ", Modello: " + modello;
    }
    
}
//creo classe officina
class Officina
{
    ArrayList<Auto> lauto = new ArrayList<>(); 


    //aggiunta auto
    void aggiunta_auto(Auto auto)
{
        lauto.add(auto);
}
    //stampa auto
    void stampatutto()
{
    if(lauto.isEmpty())
    {
        System.out.println("Non esiste nessuna auto");
    }
    else
    {
             for (Auto a : lauto)
    {
                System.out.println(a);
    }

}
}
}


public class Esercizio_Autoofficina 
{
public static void main(String[] args) 
{
    
        boolean continua = true;
        //scanner
        Scanner mystr=new Scanner(System.in);
        Scanner myint=new Scanner(System.in);

        //creo ogg officina
        Officina off = new Officina();


         while (continua) 
        {   


            //Menu
            System.out.println("--Menu--");
            System.out.println("1 - Aggiungere Auto");
            System.out.println("2 - Visualizzare Auto");
            System.out.println("4 - Esci");

            

                //scelta dell'utente
                System.out.println("Cosa vuoi fare?: ");
                int scelta=myint.nextInt();

            switch (scelta) {
                case 1 -> {
                    System.out.println("Quante auto vuoi aggiungere?: ");
                    int numauto=myint.nextInt();
                    myint.nextLine();
                    
                    for(int i=0; i<numauto; i++)
                    {
                        //aggiunge auto
                        System.out.println("Aggiungi auto: "+ (i+1));

                        System.out.println("inserisci targa");
                        String agg=mystr.nextLine();
                        mystr.nextLine();
                        

                        System.out.println("inserisci modello");
                        String mod=mystr.nextLine();
                        mystr.nextLine();
                        
                        //creo auto
                        Auto auto=new Auto(agg,mod);
                        //aggiungo auto
                        off.aggiunta_auto(auto);
                    }
                }

                case 2 -> //stampa tutte le auto
                        off.stampatutto();
                   
                case 3 -> {
                    System.out.println("Arrivederci ");
                    continua=false;
                }


                default -> System.out.println("Scelta non valida");
            }
            
        }
}
}
