package Esercizio_Serio_facade.Strategy;

public class PagamentoPayPal implements StrategiaPagamento {
    @Override
    public void EseguiPagamento(double importo) {
        System.out.println("Pagamento con PayPal: " + importo + " euro");
    }
}