import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        
        //creo lo scanner
        Scanner myint=new Scanner(System.in);
        //inizializzo le variabili 

        double saldo=1000;
        boolean continuare=true;
        double prelievo=0;
        double deposita=0;

        //ripete fino a quando l'utente non preme 4
        while (continuare)
         {  
                //Menu classic
                   System.out.println("1- visualizza saldo");
                  System.out.println("2- preleva");
                  System.out.println("3- deposita");
                  System.out.println("4- esci");


                  //chiedo utente quale opzione vuole scegliere 
                  System.out.println("Cosa vuoi fare?: ");
                  int risposta=myint.nextInt();

                  switch (risposta) {
                      case 1:
                        //visualizzo saldo 
                            System.out.println("Saldo attuale " + (saldo - prelievo + deposita ) + "Euro");
                            break;
                        case 2: 

                        //preleva
                            System.out.println("quanto vuoi prelevare?: ");
                            prelievo=myint.nextDouble();
                            //se preleva piu di 1000 entra 
                            if(prelievo>1000)
                            {
                                System.out.println("Fondi insufficienti");
                            }
                            //altrimenti esegue cio che deve fare
                            else
                            {
                                System.out.println("Saldo aggiornato: "+(saldo-prelievo)+" Euro");
                            }
                            break;
                            //deposita 
                        case 3:
                            System.out.println("Quando vuoi Depositare?: ");
                             deposita=myint.nextDouble();
                            System.out.println("Saldo aggiornato");
                            break;
                            //saluto romano
                        case 4:
                            System.out.println("Arrivederci");
                            continuare=false;
                            break;
                            //entra nel default solo se l'opzione non e nei presenti casi
                      default:
                        System.out.println("Numero non valido");
                          
                  }
                  

        }
        //chiudo lo scanner
        myint.close();
    }
    
}
