
import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio_astratta
 {
        ArrayList<veicoloConsegna>vcl=new ArrayList<>();

        Scanner myint = new Scanner(System.in);
        Scanner mystr = new Scanner(System.in);

        boolean continua=true;

        while(continua)
        {

            System.out.println("Aggiungi un veicolo");
            System.out.println("1-Furgone");
            System.out.println("2-Drone");
            System.out.println("3-Esci");
            int scelta = myint.nextInt();
            

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci targa Furgone: ");
                    String targaF = mystr.nextLine();

                    System.out.print("Inserisci carico massimo Furgone (kg): ");
                    float caricoF = myint.nextFloat();

                     
                    furgone furgone = new furgone(targaF, caricoF);
                    vcl.add(furgone);
                    break;
                case 2:
                    System.out.print("Inserisci targa Drone: ");
                    String targaD = mystr.nextLine();
                    System.out.print("Inserisci carico massimo Drone (kg): ");
                    float caricoD = myint.nextFloat();
                    
                    
                    drone drone = new drone(targaD, caricoD);
                    vcl.add(drone);
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }


}

//interface
interface tracciabile
{
    void tracciaconsegna(String codiceTracking);
}

//classe astratta
abstract class veicoloConsegna
{
    String targa;
    float caricoMassimo;

    public veicoloConsegna(String targa,float caricoMassimo) 
    {
        this.targa=targa;
        this.caricoMassimo=caricoMassimo;
    }

    public abstract void consegnaPacco(String destinazione);

    void stampainfo()
    {
        System.out.println("Targa: "+targa+ " Carico Massimo: "+caricoMassimo);
    }


}



//classe figlia
class furgone extends veicoloConsegna implements tracciabile
{   

    public furgone(String targa,float caricoMassimo) {
        super(targa,caricoMassimo );
    }
    
    
    void consegnaPacco(String destinaizione)
    {
        System.out.println("Consegnando via terra con targa: "+targa +" Destinazione:"+destinaizione);
    }
}

//classe figlia
class drone extends veicoloConsegna implements tracciabile
{

     public drone(String targa,float caricoMassimo) {
        super(targa,caricoMassimo );
    }
    
    void consegnaPacco(String destinazione)
    {
        System.out.println("Consegnando Sta volando verso la destinazione: "+destinazione);
    }
}