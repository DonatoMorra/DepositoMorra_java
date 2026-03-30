import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio_oggetti
{
    public static void main(String[] args) 
    {

        
        boolean continua = true;
        //scanner
        Scanner mystr=new Scanner(System.in);
        Scanner myint=new Scanner(System.in);
        
        //creo arraylist 
        ArrayList<BanKAccount> Bank =new ArrayList<>();
        //aggiungo utente
        Bank.add(new BanKAccount("Bruce", 0));



        while (continua) 
        {   


            //Menu
            System.out.println("--Menu--");
            System.out.println("1 - Deposita");
            System.out.println("2 - Preleva");
            System.out.println("3 - mostra saldo attuale");
            System.out.println("4 - Esci");

            //prendiamo il primo conto
            BanKAccount conto=Bank.get(0);

                //scelta dell'utente

                System.out.println("Cosa vuoi fare?: ");
                int scelta=myint.nextInt();

            switch (scelta) {
                case 1:
                //deposita
                        System.out.println("Quanto vuoi depositare?: ");
                        double deposita=myint.nextDouble();
                       conto.deposit(deposita);
                    break;

                case 2:
                //preleva
                        System.out.println("Quanto vuoi prelevare");
                        double preleva=myint.nextDouble();
                        conto.withdraw(preleva);
                    break;
                    //visualizza conto
                case 3:
                        conto.displayBalance();
                    break;

                    //arrivederci
                case 4:
                System.out.println("Arrivederci ");
                        continua=false;
                    break;


                default:
                    System.out.println("Scelta non valida");
            }
            
        }
  
    }
    
}
//classe 
class BanKAccount
{
     
    String accountHolderName;
    double balance;

    //costruttore
     BanKAccount(String accountHolderName, double balance) 
    {
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }




// metodo deposito
public  void deposit(double amount)
{   
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposito Effettuato ");
        
        }
        else
        {
            System.out.println("Importo non valido");
        }

}
// metodo prelievo
public void withdraw(double amount)
{
      
        if (amount > 0) 
        {
                balance-=amount;
            System.out.println("Prelievo effettuato: ");
        } 
        else if(amount<=balance)
        {
            System.out.println("Prelievo non valido");
        }
        else 
        {
            System.out.println("Saldo insufficiente");
        }
    


}
// metodo visualizza
public  void displayBalance()
{  
        System.out.println("Saldo attuale: "+ balance);
}



}


