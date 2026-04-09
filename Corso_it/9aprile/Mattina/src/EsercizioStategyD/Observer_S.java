package EsercizioStategyD;
import java.util.*;

//interfaccia Observer
interface Observer
{
    void update(String messaggio);
}
//concrete observer
class OrdineObserver implements Observer
{
    private Ordine ordine;

    public OrdineObserver(Ordine ordine)
    {
        this.ordine = ordine;
    }

    @Override
    public void update(String stato)
    {
        if(stato.equalsIgnoreCase("normale"))
        {
            ordine.Strategy(new EvasioneNormale());
        }
        else if(stato.equalsIgnoreCase("priorita"))
        {
            ordine.Strategy(new EvasionePrioritaria());
        }
        else if(stato.equalsIgnoreCase("controllo"))
        {
            ordine.Strategy(new EvasioneControllata());
        }

        System.out.println("Strategia aggiornata in base allo stato: " + stato);
    }
}



//class che rappresenta il centro di priorità, che funge da subject
class CentroPriorita 
{
    private String stato;
    private List<Observer> observers = new ArrayList<>();

    public void RegistraObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void RimuoveObserver(Observer observer)
    {
        observers.remove(observer);
    }
    public void NotificaObserver()
    {
        for(Observer observer : observers)
        {
            observer.update(stato);
        }
    }

    public void CambiaStato(String nuovoStato)
    {
        this.stato=nuovoStato;
        NotificaObserver();
    }

}