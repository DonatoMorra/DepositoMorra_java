import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        //Scanner
        Scanner myint=new Scanner(System.in);

        //chiamo l'istanza
        Logger log1=Logger.getInstanza();
        log1.ScriviMessaggio("Sono il primo messaggio");

        
        Logger log2=Logger.getInstanza();
        log2.ScriviMessaggio("Sono il Secondo messaggio");

        if(log1==log2)
        {
            System.out.println("Sono la stessa istanza");
        }
        else
        {
            System.out.println("non sono della stessa istanza");
        }

    }
}