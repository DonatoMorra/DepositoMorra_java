package Esercizio_Facade;

class LuceCamera
{
    void accendi()
    {
        System.out.println("Luce Camera Accesa");
    }

}
class LuceCucina
{
    void accendi()
    {
        System.out.println("Luce Cucina Accesa");
    }
}

class GestioneLuciFacade
{
    //attributi nascosti
    private LuceCamera lucecamera=new LuceCamera();
    private LuceCucina lucecucina=new LuceCucina();

    //costruttore
    public GestioneLuciFacade()
    {
        //inizializzazione degli attributi nascosti
        lucecamera=new LuceCamera();
        lucecucina=new LuceCucina();
    }


    public void accendiTutte()
    {
        lucecamera.accendi();
        lucecucina.accendi();
    }
}