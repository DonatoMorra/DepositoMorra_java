public class Esercizio1 {
    public static void main(String[] args) 
    {

        gestore_oggetti g=new gestore_oggetti();

        
        Persona p=new Persona("Jack");
        Persona p1=new Persona("Giorgio");
        
        g.utilizzo_oggetti(p);
        g.utilizzo_oggetti(p1);

        Pirata pi=new Pirata("barba nera");

        g.utilizzo_oggetti(pi);
        

    
    }
}
class Persona
{   
    String nome;

    public Persona(String nome) {
        this.nome=nome;

    }

     void saluta()
    {
        System.out.println("Ciao sono persona "+nome);
    }
}
class Pirata extends Persona
{

    public Pirata(String nome)
    {
        super(nome);
    }


     void saluta()
    {
        System.out.println("Ciao sono pirata "+nome);
    }

}

class gestore_oggetti
{

    void utilizzo_oggetti(Persona p)
   {

    p.saluta();

    }
    



}

