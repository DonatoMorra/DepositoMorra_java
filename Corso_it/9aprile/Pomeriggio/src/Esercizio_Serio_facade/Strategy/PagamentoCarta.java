package Esercizio_Serio_facade.Strategy;

interface StrategiaPagamento
{
    void EseguiPagamento(double importo);
}
//categoria Concreto
public class PagamentoCarta implements StrategiaPagamento
{
    @Override
    public void EseguiPagamento(double importo) {
        System.out.println("Pagamento con carta di credito: " + importo + " euro");
    }

}

class PagamentoPayPal implements StrategiaPagamento
{
    @Override
    public void EseguiPagamento(double importo) {
        System.out.println("Pagamento con PayPal: " + importo + " euro");
    }
}

class PagamentoBonifico implements StrategiaPagamento
{
    @Override
    public void EseguiPagamento(double importo) {
        System.out.println("Pagamento con bonifico bancario: " + importo + " euro");
    }
}