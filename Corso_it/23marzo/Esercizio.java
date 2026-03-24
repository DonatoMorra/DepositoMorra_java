import java.util.Scanner;

public class Esercizio {
    public static void main(String[] args) 
    {
        
        /*
            Create un programma che richiede all’utente Nome, anno di
            nascita e giorno della settimana (a numero) e stampa in
            maniere formattata oltre al nome, l’età e i giorni che mancano
            al prossimo weekend (sabato):
            Esempio
            ’   Il tuo nome è Tommaso, hai 39 anni e mancano 4 giorni al
            weekend’

        */

            Scanner mystr= new Scanner(System.in);
            Scanner myint= new Scanner(System.in);
            boolean continuta=true; 
             String nome;
            int giornisett=7;
                
                System.out.println("Inserisci nome");
                nome=mystr.nextLine();

                
                System.out.println("Inserisci anno di nascita");
                int anno=myint.nextInt();
                

                System.out.println("Inserisci giorno della settimana (numero)");
                int gset=myint.nextInt();


                System.out.print("Vuoi inserire un altro utente? (s/n): ");
                 String risposta = mystr.nextLine();

                             
                System.out.println("Nome: "+nome +"Età: " + (2026-anno) + " Mancano " + (giornisett-gset) + " giorni al weekend");

    
    }
}