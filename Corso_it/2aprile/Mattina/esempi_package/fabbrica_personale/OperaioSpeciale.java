package esempi_package.fabbrica_personale;

import esempi_package.fabbrica_produzione.Macchina;

public class OperaioSpeciale extends Operaio {

    public OperaioSpeciale(String nome) {
        super(nome);
    }

    public void creaProdotto(Macchina m) {
        System.out.println("Operaio Speciale crea prodotto...");
        m.creaProdotto();
    }
}