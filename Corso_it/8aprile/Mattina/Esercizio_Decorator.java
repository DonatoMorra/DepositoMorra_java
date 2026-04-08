public class Esercizio_Decorator {
        public static void main(String[] args) 
        {

           
            
        }
}
//interfaccia
interface Messaggio
{
    String getContenuto();
}

//classe concreta
abstract class MessaggioBase implements Messaggio
{
    public String getcontenuto()
    {
        return "Messaggio semplice";
    }
}

//classe astratta decorator
abstract class DecoratoreMessaggio implements  Messaggio
{
    protected  Messaggio messaggio;

    public DecoratoreMessaggio(Messaggio messaggio) {
        this.messaggio = messaggio;
    }
    
}

//Decoratore
class DecoratoreMaiuscolo extends DecoratoreMessaggio 
{

    public DecoratoreMaiuscolo(Messaggio messaggio)
    {
        super(messaggio);
    }

    public String getContenuto()
    {
        return messaggio.getContenuto().toUpperCase();
    }


}    

