package esempi_package.fabbrica_personale;

import esempi_package.fabbrica_produzione.Macchina;

public class OperaioDirigente extends Operaio {

    public OperaioDirigente(String nome) {
        super(nome);
    }

    public void stampaStato(Macchina m) {
        System.out.println("Controllo stato macchina...");
        m.stampaStato();
    }
}