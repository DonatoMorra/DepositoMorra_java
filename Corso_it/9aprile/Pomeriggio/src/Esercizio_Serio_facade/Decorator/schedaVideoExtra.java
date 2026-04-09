package Esercizio_Serio_facade.Decorator;

//extra computer scheda video
public  class SchedaVideoExtra extends ComputerExtraDecorator
{

    public SchedaVideoExtra(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + " + Scheda Video Extra";
    }
    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 300.0;
    }
}