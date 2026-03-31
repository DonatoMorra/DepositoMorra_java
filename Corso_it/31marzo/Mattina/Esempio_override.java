public class Esempio_override {

    private String nome;

    private int eta;


    // Costruttore

    public Esempio_override(String nome, int eta) {

        this.nome = nome;

        this.eta = eta;

    }


    // Override del metodo toString()

    @Override

    public String toString() {

        return "Studente: " + nome + ", Età: " + eta;

    }


    // Metodo main per testare

    public static void main(String[] args) {

        Esempio_override s1 = new Esempio_override("Luca", 20);

        System.out.println(s1); // Chiama automaticamente toString()

    }

}