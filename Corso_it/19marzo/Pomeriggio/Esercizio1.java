
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int numero=myint.nextInt();

        

        System.out.println("Il numero fattoriale è: "+fattoriale(numero));
        

    }



        //Metodo fattioriale
    static int fattoriale(int n)
    {
        int restituisce=1;

        for (int i = 1; i < n; i++) 
        {
            restituisce *=i;
            
        }

        return restituisce;
    }




}
