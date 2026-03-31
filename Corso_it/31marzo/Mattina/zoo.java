
import java.util.ArrayList;
import java.util.Scanner;

public class zoo {


              public static void main(String[] args) 
        {
        
                zoo z = new zoo();

                z.inseriscianimali();
                z.stampaVersi();
                

        }

            ArrayList <cane> canes =new ArrayList<>();
            ArrayList <gatto> gattos =new ArrayList<>();    
           

            Scanner mystr=new Scanner(System.in);
            Scanner myint=new Scanner(System.in);

            public void inseriscianimali()
            {
                System.out.println("Quanti cani vuoi inserire");
                int ncani =myint.nextInt();
                
                for (int i=0;i<ncani; i++) 
                {
                    System.out.println("Dimmi il nome del cane "+i+": ");
                    String nome=mystr.nextLine();

                    System.out.println("Dimmi eta");
                    int eta=myint.nextInt();

                    canes.add(new cane(nome, eta)); 
                }

                System.out.println("Quanti gatti vuoi inserire");
                int ngatti =myint.nextInt();
                
                for (int i=0;i<ngatti; i++) 
                {
                    System.out.println("Dimmi il nome del gatto "+i+": ");
                    String nome=mystr.nextLine();

                    System.out.println("Dimmi eta");
                    int eta=myint.nextInt();

                    gattos.add(new gatto(nome, eta)); 
                }
            }
            public void stampaVersi()
            {
                 for(cane c: canes)
            {
                c.verso();
            }
             for(gatto g: gattos)
            {
                    g.verso();
            }
            }


      
    
}

    class animale
{
    private String nome;
    private int eta;

    animale(String nome,int eta)
    {
        this.nome=nome;
        this.eta=eta;
    }

    public void verso()
    {
        System.out.println("Verso generico");
    }

    public String getNome() 
    {
        return nome;
    }

    public int geteta()
    {
        return eta;
    }
}

    class cane extends animale
{
    
    public cane(String nome,int eta) {
        super(null, 0);
        
    }

    public void verso()
    {
        System.out.println("Bau Bau fratelli");
    }


}
    class gatto extends animale
    {


   public gatto(String nome,int eta) {
        super(null, 0);
        
    }

      public void verso()
    {
        System.out.println("Miao ");
    }  



    }

