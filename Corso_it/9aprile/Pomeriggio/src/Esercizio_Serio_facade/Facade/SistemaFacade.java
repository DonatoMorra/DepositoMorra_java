package Esercizio_Facade.facade;

import esercizio_serio_facade.decorator.*;
import esercizio_serio_facade.strategy.*;

public class SistemaFacade {

    private Computer computer;
    private StrategiaPagamento strategiaPagamento;

    public void creaComputerBase(String tipo) {
        if (tipo.equalsIgnoreCase("ufficio")) {
            computer = new ComputerBaseUfficio();
        } else if (tipo.equalsIgnoreCase("gaming")) {
            computer = new ComputerBaseGaming();
        } else {
            throw new IllegalArgumentException("Tipo non valido");
        }
    }

    public void aggiungiRam() {
        computer = new RamExtra(computer);
    }

    public void aggiungiSSD() {
        computer = new SsdExtra(computer);
    }

    public void aggiungiSchedaVideo() {
        computer = new SchedaVideoExtra(computer);
    }

    public void aggiungiRaffreddamento() {
        computer = new RaffreddamentoExtra(computer);
    }

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

    public void riepilogoOrdine() {
        System.out.println("=== RIEPILOGO ORDINE ===");
        System.out.println("Configurazione: " + computer.getDescrizione());
        System.out.println("Prezzo totale: " + computer.getPrezzo() + " euro");
    }

    public void confermaOrdine() {
        System.out.println("=== CONFERMA ORDINE ===");
        strategiaPagamento.EseguiPagamento(computer.getPrezzo());
        System.out.println("Ordine completato!");
    }
}