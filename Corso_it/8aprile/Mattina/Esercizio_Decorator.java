// interfaccia
interface Messaggio {
    String getContenuto();
}

// classe concreta
class MessaggioBase implements Messaggio {
    private String contenuto;

    public MessaggioBase(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getContenuto() {
        return contenuto;
    }
}

// classe astratta decorator
abstract class DecoratoreMessaggio implements Messaggio {
    protected Messaggio messaggio;

    public DecoratoreMessaggio(Messaggio messaggio) {
        this.messaggio = messaggio;
    }
}

// decoratore
class DecoratoreMaiuscolo extends DecoratoreMessaggio {

    public DecoratoreMaiuscolo(Messaggio messaggio) {
        super(messaggio);
    }

    public String getContenuto() {
        return messaggio.getContenuto().toUpperCase();
    }
}