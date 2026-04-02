package esempi_package.fabbrica_personale;
import esempi_package.fabbrica_produzione.Macchina;

public class Operaio 
{
    private String nome;

    public Operaio(String nome) 
    {
        this.nome=nome;
    }

    

    public void Lavora(Macchina m)
    {
        System.out.println(nome+" Sta lavorando "+ m.getNome());
        m.accendi();
        m.creaProdotto();
        
    }
    public  void Ferma(Macchina m) 
    {   
         System.out.println(nome+" Sta Fermando "+ m.getNome());
        m.spegni();
       
    }
    
    
}
