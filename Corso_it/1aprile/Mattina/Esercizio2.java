import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2 
{
    public static void main(String[] args) 
    {

            Scanner mystr=new Scanner(System.in);
            Scanner myint=new Scanner(System.in);

            ArrayList<Hamburger> ordini=new ArrayList<>();
            ArrayList<dessert> dessert=new ArrayList<>();
            
           Utilizza_cibo u=new Utilizza_cibo();

            boolean continua=true;

while (continua) 
        {   


            //Menu
            System.out.println("--Menu--");
            System.out.println("1 -Crea nuovo ordine");
            System.out.println("2 - Esci");

                //scelta dell'utente

                System.out.println("Cosa vuoi fare?: ");
                int scelta=myint.nextInt();

            switch (scelta) {
                case 1:

                boolean cont=true;
                        while (cont) 
                        {           
                            //menu principale
                                System.out.println("--Menu--");
                                System.out.println("1 - Cheeseburger");
                                 System.out.println("2 - VegBurger");
                                 System.out.println("3 - DoubleBacon");
                                 System.out.println("4 - Dessert");
                                 System.out.println("5 - Esci");

                            System.out.println("Quale panino desideri?: ");
                            int scelta_panino=myint.nextInt();

                            switch (scelta_panino) 
                            {
                                case 1:

                                    ordini.add(new Cheeseburger());
                                    System.out.println("Cheeseburger aggiunto: \n");



                                    break;
                                case 2:

                                    ordini.add(new VegBurger());
                                    System.out.println("VegBurger aggiunto: \n");



                                    break;
                                case 3:
    


                                    ordini.add(new DoubleBacon());
                                    System.out.println("DoubleBacon aggiunto: \n");
                                    break;


                                case 4:
                                        boolean co=true;
                                        while (co) 
                                    { 
                                            
                                        //menu dolci
                                        System.out.println("--Menu Desset--");
                                        System.out.println("1 - Tiramisù");
                                        System.out.println("2 - esci");

                                        System.out.println("Quale dolce desideri?: ");
                                        int scelta_dolce=myint.nextInt();

                                        switch (scelta_dolce) {
                                            case 1:

                                                dessert.add(new dessert(""));
                                                System.out.println("Tiramisu aggiunto");    
                                                break;
                                            
                                            case 2:
                                                co=false;
                                                break;    
                                            default:
                                                System.out.println("Caso non trovato");
                                        }


                                    }
                                    break;

                                case 5:
                                    cont=false;
                                    break;

                                default:
                                   System.out.println("Caso non trovato");
                            }
                        
                                for(cibo h: ordini)
                                {
                                    u.utilizza_cibo_real(h);
                                }

                            
                        }
                    break;

                    //arrivederci
                case 2:
                System.out.println("Arrivederci ");
                        continua=false;
                    break;


                default:
                    System.out.println("Scelta non valida");
            }
            
        }



    }
    
}
class Hamburger extends cibo
{
    String nome;

    public Hamburger(String nome) 
    {
        this.nome=nome;
    }



    void prepara()
    {
        System.out.println("Preparazione generica di un hamburger");
    }



    public String getNome() {
        return nome;
    }

}
class Cheeseburger extends Hamburger
{

    public Cheeseburger() {
        super("Cheeseburger");
    }

    
    

    void prepara()
    {
        System.out.println("Preparazione Cheeseburger: pane ,formaggio, ketchup");
    }


}

class VegBurger extends Hamburger
{

    public VegBurger() {
        super("VegBurger");
    }
    void prepara()
    {
    System.out.println("Preparazione VegBurger: pane integrale ,burger vegetale, insalata ,pomodoro");
    }

}

class DoubleBacon extends Hamburger
{

     public DoubleBacon()
      {
        super("DoubleBacon");
    }
    void prepara()
    {
    System.out.println("Preparazione DoubleBacon: pane ,doppia carne, bacon ,cheddar,maionese ");
    }

}



class dessert extends cibo
{
    String nome;

    public dessert(String nome) 
    {
        this.nome=nome;
    }
    
    void prepara()
    {
        System.out.println("Dessert"+nome);
    }

    public String getNome() {
        return nome;
    }
    
}

class tiramisu extends dessert
{

    public tiramisu() {
        super("tiramisu");
    }

    void prepara()
    {
        System.out.println("ingredienti: Uova , Zucchero, Mascarpone, Savoiardi, Caffè, Cacao");      
    }
    
}

class cibo
{   
    //funzione
    String getNome()
    {
        return "Utilizza classe reale: "; 
    }
    void prepara()
    {
        System.out.println("Utilizza classe reale: "); 
    }


}


class Utilizza_cibo
{

    void utilizza_cibo_real(cibo c)
    {   

        System.out.println("Ordine: "+c.getNome());
        c.prepara();

        
    }

}
