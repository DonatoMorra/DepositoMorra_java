package Esercizio_Serio_facade.Decorator;

//extra computer ram
 class RamExtra extends ComputerExtraDecorator
{

    RamExtra(Computer computer) {
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