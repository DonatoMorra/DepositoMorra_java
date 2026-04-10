package Esercizio_Serio_facade.Main;

import Esercizio_Serio_facade.Facade.SistemaFacade;
import java.util.Scanner;

public class Main_EsercizioD {
    public static void main(String[] args) {
        Scanner mystr = new Scanner(System.in);
        SistemaFacade sistema = new SistemaFacade();

        System.out.println("Come lo vuoi il computer? (ufficio/gaming)");
        String risposta = mystr.nextLine();
        sistema.creaComputerBase(risposta);

        System.out.println("Vuoi aggiungere ram? (si/no)");
        if(mystr.nextLine().equalsIgnoreCase("si")) sistema.aggiungiRam();

        System.out.println("Vuoi aggiungere ssd? (si/no)");
        if(mystr.nextLine().equalsIgnoreCase("si")) sistema.aggiungiSSD();

        System.out.println("Vuoi aggiungere scheda video? (si/no)");
        if(mystr.nextLine().equalsIgnoreCase("si")) sistema.aggiungiSchedaVideo();

        System.out.println("Vuoi aggiungere raffreddamento? (si/no)");
        if(mystr.nextLine().equalsIgnoreCase("si")) sistema.aggiungiRaffreddamento();

        System.out.println("Come vuoi pagare? (carta/paypal/bonifico)");
        sistema.scegliPagamento(mystr.nextLine());

        sistema.riepilogoOrdine();
        sistema.confermaOrdine();

        mystr.close();
    }
}