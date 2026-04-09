package Esercizio_Serio_facade.Decorator;

 abstract class ComputerExtraDecorator implements Computer
{   
    //chiamata al computer
    protected Computer computer;
    //costruttore
    public ComputerExtraDecorator(Computer computer) {
        this.computer = computer;
    }
    //metodi che richiamano i metodi del computer
    @Override
    public String getDescrizione() {
        return computer.getDescrizione();
    }
    //metodo che richiamano i metodi del computer
    @Override
    public double getPrezzo() {
        return computer.getPrezzo();
    }
}