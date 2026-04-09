package EsercizioStrategyF;
public class Main_Strategy 
{
    public static void main(String[] args) {

        //creazione operazioni
        Operazione add=new addizione();
        Operazione molt=new moltiplicazione();

        //creazione calcolatore con operazione iniziale
        Calcolatore calcolatore=new Calcolatore(add);
        System.out.println("Calcolo con addizione: "+calcolatore.calcola(5, 15));

        //modifica operazione durante l'esecuzione        
        calcolatore.setOperazione(molt);
        System.out.println("Calcolo con moltiplicazione: "+calcolatore.calcola(5, 15));


    }
    

    
}
