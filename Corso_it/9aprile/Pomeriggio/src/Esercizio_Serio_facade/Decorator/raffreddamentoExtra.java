package Esercizio_Serio_facade.Decorator;

//extra computer raffreddamento
 class raffreddamentoExtra extends ComputerExtraDecorator
{

    raffreddamentoExtra(Computer computer) {
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