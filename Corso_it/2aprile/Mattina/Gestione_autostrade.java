import java.util.ArrayList;

public class Gestione_autostrade{
    public static void main(String[] args) 
    {

            ArrayList<Veicolo> veicoli = new ArrayList<>();

            //creo veicoli
            veicoli.add(new Auto("AA111AA", 120, 2, 120));
            veicoli.add(new Camion("BB222BB", 90, 4, 800));
            veicoli.add(new Moto("CC333CC", 100, 2, 1300));

            //visualizzo tutto
              for (Veicolo v : veicoli) 
            {
            System.out.println(v);
            }
        }



        
    }

// Interfaccia che obbliga tutti i veicoli a calcolare il pedaggio
interface guida
{
    public int calcolaPedaggio();
}


abstract class Veicolo implements guida
{
    private String targa;
    private int velocita;
    private int numero_di_assi;


    public Veicolo(String targa, int velocita, int numero_di_assi) 
    {
        this.targa = targa;
        //faccio i controlli 
        this.setVelocita(velocita);
        this.setNumero_di_assi(numero_di_assi);
    }

    
    public abstract int calcolaPedaggio();


   

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) 
    {
        if(velocita>=0)
        {
           this.velocita=velocita;
            
        }
        else
        {
            this.velocita=0;
        }
        
    }

    public int getNumero_di_assi() {
        return numero_di_assi;
    }

    public void setNumero_di_assi(int numero_di_assi) 
    {

        if(numero_di_assi>0){
            this.numero_di_assi = numero_di_assi;
        }
        else
         {
            this.numero_di_assi=1;
         }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veicolo{");
        sb.append("targa=").append(targa);
        sb.append(", velocita=").append(velocita);
        sb.append(", numero_di_assi=").append(numero_di_assi);
        sb.append('}');
        return sb.toString();
    }
}

class Auto extends Veicolo 
{
    private double peso;

    public Auto(String targa, int velocita, int assi, double peso)

    {
        super(targa, velocita, assi);
        this.setPeso(peso);

    }

    @Override
     public int calcolaPedaggio()
    {
        
        return 2+getNumero_di_assi();
    } 

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso)
    {
        if(peso>3500)
        {
            System.out.println("Il tuo veicolo non puo essere un auto");

        }
        else
        {
            this.peso = peso;
        }

        
    }

    @Override
public String toString() 
    {
    return "Auto{" +
           "targa=" + getTarga() +
           ", velocita=" + getVelocita() +
           ", numero_di_assi=" + getNumero_di_assi() +
           ", peso=" + peso +
           ", pedaggio=" + calcolaPedaggio() +" Euro"+
           '}';
    }
}



class Camion extends Veicolo 
{   
    private  double tipo_carico;

    public Camion(String targa, int velocita, int assi,double tipo_carico) {
        super(targa,velocita,assi);
        this.setTipo_carico(tipo_carico);
    }

    @Override
     public int calcolaPedaggio()
    {
        return getNumero_di_assi()*3;
    } 

    public double getTipo_carico() {
        return tipo_carico;
    }

    public void setTipo_carico(double tipo_carico)
    {   
        if(tipo_carico>5000)
        {
            System.out.println("Il tuo carico e troppo pesanto");            
        }
        else
        {
        this.tipo_carico = tipo_carico;
        }
    }

    @Override
public String toString()
 {
    return "Camion{" +
           "targa=" + getTarga() +
           ", velocita=" + getVelocita() +
           ", numero_di_assi=" + getNumero_di_assi() +
           ", tipo_carico=" + tipo_carico +
           ", pedaggio=" + calcolaPedaggio() +" Euro"+
           '}';
 }
}

class Moto extends Veicolo 
{
    private int cilindrata;

    public Moto(String targa, int velocita, int assi,int cilindrata) {
        super(targa,velocita,assi);
        this.setCilindrata(cilindrata);
    }
    
    @Override
     public int calcolaPedaggio()

    {
        if(cilindrata>500)
        {
            return 5;
        }
        else
        {
            return 2;
        }
    } 

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata)
    {
        if(cilindrata<=1)
        {
            System.out.println("la tua non e una moto ma e uno stirapanni");
        }
        else if(cilindrata>1300)
        {
            System.out.println("La tua moto e un razzo");
        }
        this.cilindrata = cilindrata;
    }

   @Override
public String toString() {
    return "Moto{" +
           "targa=" + getTarga() +
           ", velocita=" + getVelocita() +
           ", numero_di_assi=" + getNumero_di_assi() +
           ", cilindrata=" + cilindrata +
           ", pedaggio=" + calcolaPedaggio() +" Euro"+
           '}';
}

}
