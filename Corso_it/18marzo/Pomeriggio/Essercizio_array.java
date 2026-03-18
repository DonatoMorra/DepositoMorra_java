
import java.util.Scanner;

public class Essercizio_array {
    public static void main(String[] args) {


        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        
       //chiedo ad utente quanti dolci vuole ordinare
             System.out.println("Quanti dolci vuoi ordinare (massimo 10)");
             int lung=myint.nextInt();
             mystr.nextLine();
             boolean continuare;
             int tot=0;
             
        
    //creo arrey
        String[] nome=new String[lung];
        int[] quantita=new int[lung];
            
        //ciclo 
        for (int i = 0; i < lung; i++) 
        {
            continuare=true;

            System.out.println("inserisci un nome del dolce: ");
            nome[i]=mystr.nextLine();

            while(continuare)
            {
                System.out.println("inserisci quantità di "+ nome[i]);
                quantita[i] = myint.nextInt();
            }
            if(quantita[i]<0)
            {
                System.out.println("Quantita non valida");
            }
            else
            {
                continuare=false;
            }
        }
        for (int j = 0; j < lung; j++) 
        {
            System.out.println("Sono stati ordinati "+quantita[j]+" "+ nome[j]);
            tot+=quantita[j];
        }
            System.out.println("il totale degli ordini è "+tot);

}
}
    
        
            

        


    
    

