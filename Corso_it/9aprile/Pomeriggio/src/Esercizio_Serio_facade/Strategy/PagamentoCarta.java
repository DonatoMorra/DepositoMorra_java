package Esercizio_Serio_facade.Strategy;

public class PagamentoCarta implements StrategiaPagamento {
    @Override
    public void EseguiPagamento(double importo) {
        System.out.println("Pagamento con carta di credito: " + importo + " euro");
    }
}