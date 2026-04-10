package Esercizio_Serio_facade.Decorator;
//extra computer ssd
public class SsdExtra extends ComputerExtraDecorator
{

    public SsdExtra(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + " + SSD Extra";
    }
    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 200.0;
    }
}