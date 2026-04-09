package Esercizio_Serio_facade.Main;
import Esercizio_Serio_facade.Facade.SistemaFacade;
import java.util.Scanner;

public class Main_EsercizioD {
    public static void main(String[] args) {
        
        Scanner mystr=new Scanner(System.in);
        SistemaFacade sistema=new SistemaFacade();


        System.out.println("Come lo vuoi il computer? (ufficio/gaming)");
        String risposta=mystr.nextLine();
        sistema.creaComputerBase(risposta);

        System.out.println("Vuoi aggiungere ram? (si/no)");
        String rispostaRam=mystr.nextLine();
        if(rispostaRam.equalsIgnoreCase("si"))
        {
            System.out.println("Ram aggiunta");
            sistema.aggiungiRam();              
        }
        System.out.println("Vuoi aggiungere ssd? (si/no)");
        String rispostaSsd=mystr.nextLine();
        if(rispostaSsd.equalsIgnoreCase("si"))
        {
            System.out.println("ssd aggiunta");
            sistema.aggiungiSSD();              
        }
        System.out.println("Vuoi aggiungere scheda video? (si/no)");
        String rispostaSchedaVideo=mystr.nextLine();
        if(rispostaSchedaVideo.equalsIgnoreCase("si"))
        {
            System.out.println("Scheda video aggiunta");
            sistema.aggiungiSchedaVideo();              
        }
        System.out.println("Vuoi aggiungere raffreddamento? (si/no)");
        String rispostaRaffreddamento=mystr.nextLine();
        if(rispostaRaffreddamento.equalsIgnoreCase("si"))
        {
            System.out.println("Raffreddamento aggiunto");
            sistema.aggiungiRaffreddamento();
        }
        System.out.println("Come vuoi pagare? (carta/paypal/bonifico)");
        String rispostaPagamento=mystr.nextLine();

        sistema.scegliPagamento(rispostaPagamento);

        sistema.riepilogoOrdine();
       
        sistema.confermaOrdine();

    }
    
}
