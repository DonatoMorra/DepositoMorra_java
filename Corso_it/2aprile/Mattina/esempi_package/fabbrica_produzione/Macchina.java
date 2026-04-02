package esempi_package.fabbrica_produzione;

public class Macchina {
    private String nome;
    private boolean accesa;

    public Macchina(String nome, boolean accesa) {
        this.nome = nome;
        this.accesa = accesa;
    }

    public void accendi() {
        accesa = true;
        System.out.println("La macchina è ACCESA");
    }

    public void spegni() {
        accesa = false;
        System.out.println("La macchina è SPENTA");
    }

    public void creaProdotto() {
        if (accesa) {
            System.out.println(nome + " sta creando prodotti");
        } else {
            System.out.println(nome + " non è accesa... accendila prima!");
        }
    }

    public void stampaStato() {
        System.out.println("Macchina " + nome + " è " + (accesa ? "Accesa" : "Spenta"));
    }

    public String getNome() {
        return nome;
    }
}