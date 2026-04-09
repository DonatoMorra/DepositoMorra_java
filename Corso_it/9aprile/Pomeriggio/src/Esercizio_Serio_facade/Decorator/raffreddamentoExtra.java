package Esercizio_Serio_facade.Decorator;

//extra computer raffreddamento
public  class RaffreddamentoExtra extends ComputerExtraDecorator
{

    public RaffreddamentoExtra(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + " + Raffreddamento Extra";
    }
    @Override
    public double getPrezzo() {
        return super.getPrezzo() + 150.0;
    }
}