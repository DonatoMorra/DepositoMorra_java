
import java.util.Scanner;

public class Cifrario_di_Cesare {
    public static void main(String[] args) 
    {
        /*
        Scrivete un programma che utilizza il cifrario di Cesare per criptare una
        parola o decriptarla.
        Il Cifrario di Cesare è un algoritmo di crittografia che consiste nello spostare
        ciascuna lettera di una certa quantità di posti nell'alfabeto. Per utilizzarlo, si
        sceglie una chiave (scelta dall’utente) che rappresenta il numero di posti
        di cui ogni lettera dell'alfabeto verrà spostata: ad esempio, se si sceglie
        una chiave di 3, la lettera A diventerà D, la lettera B diventerà E e così via.
        Per decifrare un messaggio cifrato con il cifrario di Cesare bisogna
        conoscere la chiave utilizzata e spostare ogni lettera indietro di un numero di 
        posti corrispondente alla chiave. 
        */

        Scanner mystr=new Scanner(System.in);
        Scanner myint=new Scanner(System.in);

        System.out.println("Cifrario di Cesare");//Titolo

        System.out.println("inserisci Testo");  //Utente inserisce testo
        String parola=mystr.nextLine();

        System.out.println("Iserisci la chiave(numero intero)"); //Key inserita dall'utente
        int key=myint.nextInt();

         System.out.println("Vuoi cifrare o decifrare? (c/d): ");
        String scelta = mystr.nextLine().toLowerCase();

        String risultato = "";

         for (int i = 0; i < parola.length(); i++) 
         {
            char c = parola.charAt(i);  //prendo il singolo carattere 


         if (Character.isLetter(c)) 
          {
            if (scelta.equals("c"))
            {
                c = (char) ('a' + (c - 'a' + key) % 26);
            }
            else if (scelta.equals("d"))
            {
                c = (char) ('a' + (c - 'a' - key + 26) % 26);
            }
          }

            risultato += c;
        }

        if (scelta.equals("c")) 
         {
            System.out.println("Testo cifrato: " + risultato);
         } 
        else if (scelta.equals("d"))
         {
            System.out.println("Testo decifrato: " + risultato);
         } 
        else 
         {
            System.out.println("Scelta non valida!");
         }


    }
}