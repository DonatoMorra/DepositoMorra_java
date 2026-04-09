package EsercizioStrategyM;
//interfaccia 
interface MetodoPagamento
{
    void paga(double importo);
}

//implementazione concreta
class CartaDiCredito implements MetodoPagamento
{
    public void paga(double importo)
    {
        System.out.println("Pagamento di "+importo+" effettuato con carta di credito.");
    }
}
//implementazione concreta
class Paypal implements MetodoPagamento
{
    public void paga(double importo)
    {
        System.out.println("Pagamento di "+importo+" effettuato con PayPal.");
    }
}

// Context
class PagamentoContext
{
    private MetodoPagamento metodoPagamento;

    public PagamentoContext(MetodoPagamento metodoPagamento)
    {
        this.metodoPagamento=metodoPagamento;
    }

    public void SetMetodo(MetodoPagamento metodoPagamento)
    {
        this.metodoPagamento=metodoPagamento;
    }

    public void eseguiPagamento(double importo)
    {
        metodoPagamento.paga(importo);
    }

}
