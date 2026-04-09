package Esercizio_Serio_facade.Decorator;

//extra computer scheda video
 class schedaVideoExtra extends ComputerExtraDecorator
{

    schedaVideoExtra(Computer computer) {
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