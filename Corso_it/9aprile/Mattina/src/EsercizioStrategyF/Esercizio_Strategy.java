package EsercizioStrategyF;

interface Operazione {
    int esegui(int a, int b);
}

class addizione implements Operazione {

    @Override
    public int esegui(int a, int b) {
        return a + b;
    }

}
class moltiplicazione implements Operazione {

    @Override
    public int esegui(int a, int b) {
        return a * b;
    }

}
//
class Calcolatore
{
    private Operazione operazione;

    public Calcolatore(Operazione operazione) {
        this.operazione = operazione;
    }

    public void setOperazione(Operazione operazione) {
        this.operazione = operazione;
    }

    public int calcola(int a, int b) {
        return operazione.esegui(a, b);

}
}