package Esercizio_Serio_facade.Strategy;

public class PagamentoBonifico implements StrategiaPagamento {
    @Override
    public void EseguiPagamento(double importo) {
        System.out.println("Pagamento con bonifico bancario: " + importo + " euro");
    }
}