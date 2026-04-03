
import java.util.ArrayList;

public class Docente extends Persona implements Registrabile 
{
    private String materia;
    ArrayList<Studente>StudentiMateria=new ArrayList<>();

    public Docente(String nome,int eta,String materia) {
        super(nome, eta);
        this.materia=materia;
    }
    
    public void aggiungiStudente(Studente s) {
        StudentiMateria.add(s);
    }

     public boolean contieneStudente(Studente s) {
        return StudentiMateria.contains(s);
    }


    public void assegnaVoto(Studente s, int voto)
    {
        
        s.aggiungiVoto(voto);
    }

    

    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente di  " + materia);
    }
    
     @Override
    public void registrazione() {
        System.out.println("Registrazione tramite segreteria didattica");
    }
}
