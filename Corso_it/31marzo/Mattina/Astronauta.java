import java.util.ArrayList;
import java.util.Scanner;

public class Astronauta 
{
    private String nome;
    private String email;
    private float creditoOssigeno;

        public Astronauta(String nome,String email) 
        {
            this.nome=nome;
            this.email=email;
            generaOssigenoCasuale();
        }
       
        public void generaOssigenoCasuale() 
        {
         this.creditoOssigeno = (float)(Math.random() * 100); 
        }

        public void stampaDati() 
        {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Ossigeno: " + creditoOssigeno);
        }


    public String getnome()
    {
        return nome;
    }
    public String getemail()
    {
        return email;
    }
    public float getCreditoOssigeno()
    {
        return creditoOssigeno;
    }
    
}

 class StazioneSpaziale 
{

    ArrayList<String> esperimenti=new ArrayList<>();
    ArrayList<Integer> valutazioni=new ArrayList<>();

    public void aggiuntaEsperimento(String esp)
    {
        esperimenti.add(esp);
    }

      public void aggiuntaValutazione(int val)
    {
        valutazioni.add(val);
    }


     public void stampaEsperimenti()
      {

        System.out.println("Esperimenti:");
        for (String e : esperimenti) 
        {
            System.out.println("- " + e);
        }
    }
      public void stampavalutazioni()
      {

        System.out.println("Valutazioni:");
        for (int v : valutazioni) 
        {
            System.out.println("- " + v);
        }
    }




}
class scienziato extends Astronauta
    {   
        public scienziato(String nome,String email) 
        {
            super(nome, email);
        }
    }   
class ispettore extends Astronauta
    {   
        public ispettore(String nome,String email) 
        {
            super(nome,email);
        }
    }

    public static void main(String[] args)
    {

        Scanner myint = new Scanner(System.in);
        Scanner mystr = new Scanner(System.in);

        ArrayList<Astronauta> ast=new ArrayList<>();
        StazioneSpaziale staz = new StazioneSpaziale();
       
        boolean continua=true;
        

        while (continua) 
        { 
            
        
            System.out.println("--- MENU ---");
            System.out.println("1 - Crea astronauta");
            System.out.println("2 - Visualizza dati");
            System.out.println("3 - Login");
            System.out.println("4 - Interagire con il profilo");
            System.out.println("5 - esci");
           

            int scelta = myint.nextInt();
            

            switch (scelta) {
                case 1:
                  
                    // creo astronauta
                    System.out.print("Nome: ");
                    String nome = mystr.nextLine();

                    System.out.print("Email: ");
                    String email = mystr.nextLine();    

                    ast.add(new Astronauta(nome,email));
                    System.out.println("Astronauta creato");
                    break;

                case 2:

                    //visualizzo dati astronauta
                    if(ast.isEmpty())
                    {
                        System.out.println("Non esiste nessun astronauta");
                        break;
                    }
                    else{
                        for (Astronauta a : ast) 
                    {
                        a.stampaDati();
                        System.out.println("------");
                    }
                }
                    break;

                case 3:
                    //effettua login

                     System.out.print("Inserisci email: ");
                    String emailLogin = mystr.nextLine();

                    System.out.println("login effettuato");
                    
                    break;

                case 4:

                    

                    //interagire con il profilo
                    System.out.println("Vuoi aggiungere esperimento? (s/n)");
                    String risposta=mystr.nextLine();

                    if(risposta.equalsIgnoreCase("s"))
                    {
                        System.out.println("Dimmi l'esperimento?: ");
                        String esp=mystr.nextLine();
                        staz.aggiuntaEsperimento(esp);

                    }   

                    System.out.println("vuoi aggiungere valutazione?: (s/n)");
                    String risp=mystr.nextLine();

                     if(risp.equalsIgnoreCase("s"))
                    {
                        System.out.println("Dimmi la valutazione: ");
                         int val = myint.nextInt();
                        staz.aggiuntaValutazione(val);
                
                    }   
                    
                    staz.stampaEsperimenti();
                    staz.stampavalutazioni();
                 


                    break;

                case 5:
                //esco
                     continua=false;
                    break;

            }

        } 

        myint.close();
        mystr.close();
        
    }
