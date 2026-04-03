
import java.util.ArrayList;

class Studente extends Persona implements Registrabile {
    private String classeFrequentata;
    
    private ArrayList<Integer> voti = new ArrayList<>();

    public Studente(String nome, int eta, String classeFrequentata) {
        super(nome, eta);
        this.classeFrequentata = classeFrequentata;
    }

    public void aggiungiVoto(int voto) {
        voti.add(voto);
    }

    public void stampaVoti() 
    {
         if(voti.isEmpty()) {
            System.out.println("Nessun voto registrato");
            return;
        }
        else
        {
             System.out.println("Voti: " + voti);
        }
    }

    @Override
    public void descriviRuolo() {
        System.out.println("Sono uno studente della classe " + classeFrequentata);
    }

    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite modulo online");
    }
}