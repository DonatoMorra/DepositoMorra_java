public class Veicolo 
{

    String marca;
    String modello;
    int anno;
    double prezzo;

    void visualizzaVeicolo()
    {
        System.out.println("Marca Veicolo: "+ this.marca +"\n " + "Modello Veicolo: "+ this.modello+"\n" + "Anno Veicolo: " + anno+"\n"+ "Prezzo Veicolo"+prezzo+"Euro");
        System.out.println("---------------------------------------------------------");
    }

    
    void visualizzaPrezzo()
    {
        System.out.println("Prezzo: "+this.prezzo);
    }



    
}
