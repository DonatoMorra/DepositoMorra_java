import java.util.Scanner;

public class Esercizio_Math {
    public static void main(String[] args) {
        
        
        Scanner myObjint = new Scanner(System.in);

        //MENU
        System.out.println("--- MENU ---");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("---------------");

        //scelta dell'utente
        int scelta=myObjint.nextInt();
        

        double a, b, risultato = 0;

        switch (scelta) {

            case 1:
                System.out.print("Primo numero: ");
                a = myObjint.nextInt();
                System.out.print("Secondo numero: ");
                b = myObjint.nextInt();
                risultato = a + b;
                break;

            case 2:
                System.out.print("Primo numero: ");
                a = myObjint.nextInt();
                System.out.print("Secondo numero: ");
                b = myObjint.nextInt();
                risultato = a - b;
                break;

            case 3:
                System.out.print("Primo numero: ");
                a = myObjint.nextInt();
                System.out.print("Secondo numero: ");
                b = myObjint.nextInt();
                risultato = a * b;
                break;

            case 4:
                System.out.print("Primo numero: ");
                a = myObjint.nextInt();
                System.out.print("Secondo numero: ");
                b = myObjint.nextInt();
                risultato = a / (b + 0.00001);
                break;

                default:
                    throw new AssertionError();
            

            

    }
    
}
}
