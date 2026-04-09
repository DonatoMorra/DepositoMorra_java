package Esercizio_Serio_facade.Decorator;

//extra computer ram
public class RamExtra extends ComputerExtraDecorator
{

    public RamExtra(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + " + Ram Extra";
    }
    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 100.0;
    }
}