import java.util.ArrayList;

public class Hotel
{

    private String nome;
    private static ArrayList<Camera> camera;

    //costruttore
    public Hotel(String nome) 
    {
        this.nome=nome;
        this.camera=new ArrayList<>();
    }


    public static void aggiungicamera(Camera c)
    {
        camera.add(c);

    }
    public static int contaSuite(ArrayList<Camera> list)
    {
        int conta=0;
        for (Camera c : list) 
        {   
            if(c instanceof Suite);
            {
                conta++;
            }
            
        }
        return conta;
    }

    public static void main(String[] args) 
    {   
        Hotel hotel = new Hotel("Le SUITE DE PARIGE");

        //camera normali             
        Camera camera1=new Camera(1, 20);
        Camera camera2=new Camera(5, 50);
        Camera camera3=new Camera(69, 500);
        
        
        //Suite
        Suite suite1=new Suite(1, 5000, "Vasca idromassaggio");
        Suite suite2=new Suite(2, 5000, "Cinema privato");
        Suite suite3=new Suite(70, 5000, "Sala Giochi privato");

        //aggiungo camera
        hotel.aggiungicamera(camera1);
        hotel.aggiungicamera(camera2);
        hotel.aggiungicamera(camera3);

        //aggiungo Suite
        hotel.aggiungicamera(suite1);
        hotel.aggiungicamera(suite2);
        hotel.aggiungicamera(suite3);

        //dettaglio camere
        System.out.println("Dettaglio Camere: ");
        camera1.dettagli();
        camera2.dettagli();
        camera3.dettagli();

        //dettaglio Suite
        System.out.println("Dettaglio Suite");
        suite1.dettagli();
        suite2.dettagli();
        suite3.dettagli();

        //Conteggio Suite Xsbagliato
        int numerosuite=hotel.contaSuite(hotel.camera);
        System.out.println("Numero di Suite: "+ numerosuite);
        


    }
}


class Camera
{
    private int numero;
    private float prezzo;

    //costruttore
    public Camera(int numero,float prezzo) 
    {
        this.numero=numero;
        this.prezzo=prezzo; 
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }


   //senza parametri
    public void dettagli()
    {
         System.out.println("Numero Camera: "+numero +" - "+"Prezzo: "+prezzo+" Euro");   
         System.out.println("-------------------------------------");
    }

    //con parametri
    public void dettagli(boolean  conPrezzo)
    {
        
        if(conPrezzo=true)
        {
           System.out.println("Numero Camera: "+numero +" - "+"Prezzo: "+prezzo+" Euro");
           System.out.println("-------------------------------------");
        }
        else
        {
            System.out.println("Numero Camera: "+numero);
            System.out.println("-------------------------------------");

        }
       
    }

   
}
class Suite extends Camera
{
    private String ServiziExtra;

    //costruttore con SuperSayan
    public Suite(int numero,float prezzo,String ServiziExtra) 
    {
        super(numero,prezzo);
        this.ServiziExtra=ServiziExtra;
    }

        public String getServiziExtra() 
    {
        return ServiziExtra;
    }

    public void setServiziExtra(String ServiziExtra) {
        this.ServiziExtra = ServiziExtra;
    }

    @Override
    public void dettagli()
    {
        System.out.println("Numero Suite: "+getNumero()+"\n" +"Prezzo: "+getPrezzo()+"\n" +"Servizi Extra: "+ ServiziExtra);
        System.out.println("-------------------------------------");
    }


}
