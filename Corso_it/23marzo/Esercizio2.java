import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        /*
            Scrivete un gioco in cui il giocatore 1 inserisce un
            numero da 1 a 100 e il giocatore2 ha 5 tentativi per
            indovinare il numero.
            Il programma fornisce suggerimenti (troppo alto,
            troppo basso), termina quando l'utente indovina
            correttamente, quando i tentativi finiscono o se
            scrive «mi arrendo».
        */
        

            Scanner mystr= new Scanner(System.in);
            Scanner myint= new Scanner(System.in);
            int tenativi=5;
            boolean indovinato=true;


                //player 1 inserisce il numero da indovinare
             System.out.println("Player 1 Inserisci un numero da 1 a 100");
             int num=myint.nextInt();
            System.out.println("Numero inserito");

            //Inizia il gioco 
            System.out.println("Player 2 hai 5 tentativi per indovinare");

            
            for (int i=0; i<tenativi; i++)
            {
                System.out.println("Tentativo "+(i+1)+"  scrivi 'mi arrendo' per arrenderti: ");
                String ten=myint.nextLine();

              
                  if (ten.equalsIgnoreCase("mi arrendo")) {
                System.out.println("Ti sei arreso! Il numero era: " + num);
                break;
            }

            int ten1 = Integer.parseInt(ten);

                if(ten1<num)
                {
                    System.out.println("Numero troppo piccolo");
                }
                else if (ten1>num) 
                {
                    System.out.println("Numero troppo grande");
                }
                else 
                {
                    System.out.println("hai indovinato");
                    indovinato=false;
                    break;
                }
            }
             if(indovinato)
                {
                    System.out.println("GAME OVER");
                    System.out.println("Il numero era " + num);
                }



    }


    
}
