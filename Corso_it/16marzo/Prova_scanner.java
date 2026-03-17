import java.util.Scanner; //import the Scanner class

public class Prova_scanner {
    public static void main(String[] arghs)
    {
        //chiamiamo lo scanner con un nome 
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter username");

        //Scrive utente input
        String userName=myObj.nextLine();

        //chiamiamo username
        System.out.println("Username is: "+userName);
    }
    
}
