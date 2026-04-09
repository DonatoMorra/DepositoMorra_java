package EsercizioStategyD;

//interfaccia strategia
interface StrategiaEvasione
{
    void eseguiEvasione(double prezzo);
}
//Context per la strategia normale
class EvasioneNormale implements StrategiaEvasione
{
    public void eseguiEvasione(double prezzo)
    {

        double tot = prezzo + prezzo * 0.05;
        System.out.println("Ordine evaso con procedura standard: " + tot + " + 5%");
    }
}
//Context per la strategia prioritaria
class EvasionePrioritaria implements StrategiaEvasione
{
    public void eseguiEvasione(double prezzo)
    {
        double tot = prezzo + prezzo * 0.15;
        System.out.println("Ordine evaso con procedura prioritaria: " + tot + " + 15%");
    }
}
//Context per la strategia controllata
class EvasioneControllata implements StrategiaEvasione
{
    public void eseguiEvasione(double prezzo)
    {
        double tot = prezzo - prezzo * 0.05;
        System.out.println("Ordine evaso con procedura controllata: " + tot + " - 5%");
    }
}
//class che rappresenta l'ordine, che funge da context per la strategia
class Ordine
{
    int id;
    String cliente;
    String prodotto;
    double prezzo;

    private StrategiaEvasione strategiaEvasione;

    public Ordine(int id, String cliente, String prodotto, double prezzo, StrategiaEvasione strategiaEvasione)
    {
        this.id=id;
        this.cliente=cliente;
        this.prodotto=prodotto;
        this.prezzo=prezzo;
        this.strategiaEvasione=strategiaEvasione;
    }
    //metodo per cambiare la strategia di evasione
    public void Strategy(StrategiaEvasione strategiaEvasione)
    {
        this.strategiaEvasione=strategiaEvasione;
    }
    //metodo che esegue la strategia
    public void EseguiStrategy()
    {
        strategiaEvasione.eseguiEvasione(prezzo);
    }
    //metodo che visualizza i dati ordine
    public void VisualizzaDati()
    {
        System.out.println("ID: "+id);
        System.out.println("Cliente: "+cliente);
        System.out.println("Prodotto: "+prodotto);
        System.out.println("Prezzo: "+prezzo);
    }

}