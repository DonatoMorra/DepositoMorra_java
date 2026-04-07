public class Singleton {

    //Instanza privata statica della classa Singleton
private static Singleton instance;

//costruttore privato per imperdire l'instanziazione diretta
private Singleton(){}

//Metodo publico statico per ottenere l'unica instranza della classe
public static Singleton getInstance()
{
    //se l'stanza non esiste viene creata
    if(instance==null)
    {
        instance=new Singleton();
    }
    //restituisce l'stanza esistente o appena creata
    return instance;    
}


//metodo di esempio che puo essere chiamato sull'ostanza Singleton
public void DoSomething()
{
    System.out.println("Singleton: DoSomething() called");
}

    
}
