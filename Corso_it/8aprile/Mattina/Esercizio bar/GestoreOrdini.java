import java.util.ArrayList;
import java.util.List;

public class GestoreOrdini {

    private static GestoreOrdini istanza;

    // ordine attuale
    private List<Bevanda> ordineCorrente;

    // storico
    private List<List<Bevanda>> storicoOrdini;

    // costruttore privato
    private GestoreOrdini() {
        ordineCorrente = new ArrayList<>();
        storicoOrdini = new ArrayList<>();
    }

    // accesso singleton
    public static GestoreOrdini getIstanza() {
        if (istanza == null) {
            istanza = new GestoreOrdini();
        }
        return istanza;
    }

    // aggiungi bevanda
    public void aggiungi(Bevanda bevanda) {
        ordineCorrente.add(bevanda);
        System.out.println("Aggiunto: " + bevanda.getDescrizione());
    }

    // mostra ordine corrente
    public void mostraOrdineCorrente() {
        System.out.println("\n---ORDINE---");

        if (ordineCorrente.isEmpty()) {
            System.out.println("Nessuna bevanda");
            return;
        }

        double totale = 0;

        for (Bevanda bevanda : ordineCorrente) {
            System.out.println(bevanda.getDescrizione() + " - " + bevanda.getPrezzo());
            totale += bevanda.getPrezzo();
        }

        System.out.println("Totale: " + totale);
    }

    // conferma ordine
    public void confermaOrdine() {
        if (ordineCorrente.isEmpty()) {
            System.out.println("Ordine vuoto");
            return;
        }

        storicoOrdini.add(new ArrayList<>(ordineCorrente));
        ordineCorrente.clear();

        System.out.println("Ordine confermato");
    }

    // storico
    public void mostraStorico() {
        System.out.println("\n--STORICO ORDINI--");

        if (storicoOrdini.isEmpty()) {
            System.out.println("Nessun ordine.");
            return;
        }

        int i = 1;

        for (List<Bevanda> ordine : storicoOrdini) {
            System.out.println("Ordine " + i++);

            for (Bevanda b : ordine) {
                System.out.println("- " + b.getDescrizione());
            }
        }
    }
}