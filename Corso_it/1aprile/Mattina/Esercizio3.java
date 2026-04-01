public class Esercizio3 
{
    public static void main(String[] args) {
        

        gestione_principale gp=new gestione_principale();



        







    }
    
}

class gestione_principale 
{
    void utilizza_gestione(capo_principale c)
    {
        c.mostra_dettagli();
    }


}




// prima classe principale
class capo_principale extends gestore_oggetti
{
    private int codice;
    private String nome;
    private String tessuto;
    private String colore;
    private double taglia;
    private double prezzo;

    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) 
    {
        
        if(nome.isBlank() || nome.isEmpty())
        {
            System.out.println("Nome non puo essere vuoto");
        }
        this.nome = nome;
    }
    public String getTessuto() {
        return tessuto;
    }
    public void setTessuto(String tessuto) {
        this.tessuto = tessuto;
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore)  {   
      
        if(colore.isBlank() || colore.isEmpty())
        {
            System.out.println("Colore non puo essere vuoto");
        }
          this.colore = colore;



    }
    public double getTaglia() {
        return taglia;
    }
    public void setTaglia(double taglia)
    {

        
        if(taglia<=0)
        {
            System.out.println("La taglia non puo essere vuoto");
        }
        this.taglia = taglia;

    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) 
    {
        
        if(!(prezzo<=0))
        {
            System.out.println("prezzo non valido");
        }
        this.prezzo = prezzo;
    }
    
    void mostra_dettagli()
    {
        System.out.println("Codice: "+codice);
        System.out.println("Nome: "+nome);
        System.out.println("Tessuto: "+tessuto);
        System.out.println("Colore: "+colore);
        System.out.println("Taglia: "+taglia);
        System.out.println("Prezzo: "+prezzo);

    }

}
//sottoclasse capo principale
class giacca extends capo_principale
{
    int numero_bottoni;

    public giacca(int numero_bottoni) 
    {
        
        this.numero_bottoni=numero_bottoni;
    }

    void mostra_dettagli()
    {
        System.out.println("Numero bottoni: "+numero_bottoni);
    }


}


//sottoclasse capo principale
class pantalone extends  capo_principale
{
    String tipo_taglio;

    public pantalone(String tipo_taglio) 
    {
        this.tipo_taglio=tipo_taglio;
    }

    
    void mostra_dettagli()
    {
        System.out.println("tipo taglio: "+tipo_taglio);
    }


}

//sottoclasse capo principale
class gilet extends capo_principale

{
    boolean reverpresente;

    public gilet(boolean  reverpresente) 
    {
        this.reverpresente=reverpresente;
    }
    
    
    void mostra_dettagli()
    {
        System.out.println("Reversibile: "+reverpresente);
    }

}


// seconda classe principale
class componenti_finitura extends gestore_oggetti
{
    private int codice;
    private String nome;
    private String materiale;
    private String colore;
    private double prezzo;


    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.isBlank() || nome.isEmpty())
        {
            System.out.println("Nome non puo essere vuoto");
        }
        this.nome = nome;
    }
    public String getMateriale() {
        return materiale;
    }
    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
         if(colore.isBlank() || colore.isEmpty())
        {
            System.out.println("Colore non puo essere vuoto");
        }
          this.colore = colore;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) 
    {
          if(!(prezzo<=0))
        {
            System.out.println("prezzo non valido");
        }

        this.prezzo = prezzo;
       
    }

     void mostra_dettagli()
    {
        System.out.println("Codice: "+codice);
        System.out.println("Nome: "+nome);
        System.out.println("Materiale: "+materiale);
        System.out.println("Colore: "+colore);
        System.out.println("Prezzo: "+prezzo);
    }
    
}

//sottoclasse componenti finitura
class cravatta extends componenti_finitura
{
    double larghezza;

    public cravatta(double larghezza)
    {
        this.larghezza=larghezza;
    }

    
    void mostra_dettagli()
    {
        System.out.println("Larghezza cravatta: "+larghezza);
    }
    

}

//sottoclasse componenti finitura
class papillon extends componenti_finitura
{
    String tipo_chiusura;

    public papillon(String tipo_chiusura) 
    {
        this.tipo_chiusura=tipo_chiusura;
    }

    
    void mostra_dettagli()
    {
        System.out.println("tipo chiusura: "+tipo_chiusura);
    }



}

//sottoclasse componenti finitura
class pochette extends componenti_finitura
{
    boolean piega_decorativa;

    public pochette(boolean piega_decorativa) 
    {
        this.piega_decorativa=piega_decorativa;
    }
    
    void mostra_dettagli()
    {
        System.out.println("piega_decorativa: "+piega_decorativa);
    }
}



