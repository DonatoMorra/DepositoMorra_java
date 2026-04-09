package Esercizio_Serio_facade.Facade;

import Esercizio_Serio_facade.Decorator.*;
import Esercizio_Serio_facade.Strategy.*;



public class SistemaFacade {

    private Computer computer;
    private StrategiaPagamento strategiaPagamento;

    // 1. Creazione computer base
    public void creaComputerBase(String tipo) {
        if (tipo.equalsIgnoreCase("ufficio")) 
        {
            computer = new ComputerBaseUfficio();
        } else if (tipo.equalsIgnoreCase("gaming")) 
        {
            computer = new ComputerBaseGaming();
        } else {
            throw new IllegalArgumentException("Tipo non valido");
        }
    }

    // 2. Aggiunta extra
    public void aggiungiRam() {
        computer = new RamExtra(computer);
    }

    public void aggiungiSSD() {
        computer = new ssdExtra(computer);
    }

    public void aggiungiSchedaVideo() {
        computer = new schedaVideoExtra(computer);
    }

    public void aggiungiRaffreddamento() {
        computer = new raffreddamentoExtra(computer);
    }

    // 3. Scelta metodo di pagamento
    public void scegliPagamento(String metodo) {
        if (metodo.equalsIgnoreCase("carta")) {
            strategiaPagamento = new PagamentoCarta();
        } else if (metodo.equalsIgnoreCase("paypal")) {
            strategiaPagamento = new PagamentoPayPal();
        } else if (metodo.equalsIgnoreCase("bonifico")) {
            strategiaPagamento = new PagamentoBonifico();
        } else {
            throw new IllegalArgumentException("Metodo di pagamento non valido");
        }
    }

    // 4. Riepilogo ordine
    public void riepilogoOrdine() {
        System.out.println("=== RIEPILOGO ORDINE ===");
        System.out.println("Configurazione: " + computer.getDescrizione());
        System.out.println("Prezzo totale: " + computer.getPrezzo() + " euro");
    }

    // 5. Conferma ordine
    public void confermaOrdine() {
        System.out.println("=== CONFERMA ORDINE ===");
        strategiaPagamento.EseguiPagamento(computer.getPrezzo());
        System.out.println("Ordine completato!");
    }
}