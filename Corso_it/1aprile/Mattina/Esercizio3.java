
import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio3 
{
    public static void main(String[] args) {
        
        Scanner myint=new Scanner(System.in);
        Scanner mystr=new Scanner(System.in);

        ArrayList<capo_principale>cp=new ArrayList<>();

        gestione_principale gp=new gestione_principale();

 /*    
         giacca g = new giacca(2);
        g.setNome("Smoking");
        g.setColore("Nero");
        g.setPrezzo(200);
        g.setTaglia(48);
        g.setTessuto("Lana");

        pantalone p = new pantalone("Slim");
        p.setNome("Pantalone elegante");
        p.setColore("Nero");
        p.setPrezzo(100);
        p.setTaglia(48);
        p.setTessuto("Cotone");


        gp.utilizza_gestione(g);
        gp.utilizza_gestione(p);
   */ 
   
  
    ///* 
    boolean continua=true;
        while (continua) 
        {
                System.out.println("\n=== MENU ===");
            System.out.println("1 - Aggiungi Giacca");
            System.out.println("2 - Aggiungi Pantalone");
            System.out.println("3 - Aggiungi Gilet");
            System.out.println("4 - Mostra tutti i capi");
            System.out.println("5 - Esci");

                System.out.println("Cosa vuoi fare?: ");
                int scelta=myint.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeG = mystr.nextLine();

                    System.out.print("Colore: ");
                    String coloreG = mystr.nextLine();

                    System.out.print("Tessuto: ");
                    String tessutoG = mystr.nextLine();

                    System.out.print("Taglia: ");
                    double tagliaG = myint.nextDouble();

                    System.out.print("Prezzo: ");
                    double prezzoG = myint.nextDouble();

                    System.out.print("Numero bottoni: ");
                    int bottoni = myint.nextInt();
                    
                    if(nomeG.isEmpty() || coloreG.isEmpty() || tessutoG.isEmpty() || tagliaG<0 || prezzoG<0 || bottoni<0)
                    {
                        System.out.println("Dati non validi");
                    }
                    else
                    {   
                        giacca g = new giacca(bottoni);
                        g.setNome(nomeG);
                        g.setColore(coloreG);
                        g.setPrezzo(prezzoG);
                        g.setTaglia(tagliaG);
                        g.setTessuto(tessutoG);

                        cp.add(g);
                        break;
                    }
                break;
                case 2:

                         System.out.print("Nome: ");
                    String nomeP = mystr.nextLine();

                    System.out.print("Colore: ");
                    String coloreP = mystr.nextLine();

                    System.out.print("Tessuto: ");
                    String tessutoP = mystr.nextLine();

                    System.out.print("Taglia: ");
                    double tagliaP = myint.nextDouble();

                    System.out.print("Prezzo: ");
                    double prezzoP = myint.nextDouble();

                    System.out.print("Tipo taglio: ");
                    String tipo_taglio = mystr.nextLine();
                    
                      if(nomeP.isEmpty() || coloreP.isEmpty() || tessutoP.isEmpty() || tagliaP<0 || prezzoP<0 || tipo_taglio.isEmpty())
                    {
                        System.out.println("Dati non validi");
                    }
                    else
                    {   
                        pantalone p = new pantalone(tipo_taglio);
                        p.setNome(nomeP);
                        p.setColore(coloreP);
                        p.setPrezzo(prezzoP);
                        p.setTaglia(tagliaP);
                        p.setTessuto(tessutoP);

                        cp.add(p);
                        break;
                    }


                break;
                 case 3:
                        System.out.print("Nome: ");
                    String nomeGl = mystr.nextLine();

                    System.out.print("Colore: ");
                    String coloreGl = mystr.nextLine();

                    System.out.print("Tessuto: ");
                    String tessutoGl = mystr.nextLine();

                    System.out.print("Taglia: ");
                    double tagliaGl = myint.nextDouble();

                    System.out.print("Prezzo: ");
                    double prezzoGl = myint.nextDouble();

                    System.out.print("Rever presente (true/false): ");
                    boolean rever = myint.nextBoolean();

                    if(rever==false)
                    {
                        System.out.println("Revers non presente");
                    }
                    else
                    {
                        System.out.println("Revers presente");
                    }
                    
                    if(nomeGl.isEmpty() || coloreGl.isEmpty() || tessutoGl.isEmpty() || tagliaGl<0 || prezzoGl<0)
                    {
                        System.out.println("Dati non validi");
                    }
                    else
                    {   
                        gilet gl = new gilet(rever);
                        gl.setNome(nomeGl);
                        gl.setColore(coloreGl);
                        gl.setTessuto(tessutoGl);
                        gl.setTaglia(tagliaGl);
                        gl.setPrezzo(prezzoGl);
                        gl.setReverpresente(rever);
                    
                        cp.add(gl);
                        break;
                    }


                break;
                case 4:

                    if(cp.isEmpty())
                    {
                        System.out.println("nessun capo esistente");
                        break;
                    }
                    else{
                    
                    for(capo_principale c: cp)
                    {
                        gp.utilizza_gestione(c);
                        System.out.println("---------------");

                    }
                    }
                 break;
                 case 5:
                        System.out.println("Arrivederci");
                        continua=false;
                        break;

                default:
                    System.out.println("Caso non trovato");
            }

            
        }
        //*/

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
            return;
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
        
        if(prezzo<=0)
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
        super.mostra_dettagli();
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
        super.mostra_dettagli();
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
        super.mostra_dettagli();
        System.out.println("Reversibile: "+reverpresente);
    }


    public boolean isReverpresente() {
        return reverpresente;
    }


    public void setReverpresente(boolean reverpresente) {
        this.reverpresente = reverpresente;
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
            return;
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
          if(prezzo<=0)
        {
            System.out.println("prezzo non valido");
        }

        this.prezzo = prezzo;
       
    }

     void mostra_dettagli()
    {
        System.out.println("Codice: "+codice);
        System.out.println("Nome: "+ nome);
        System.out.println("Materiale: "+ materiale);
        System.out.println("Colore: "+ colore);
        System.out.println("Prezzo: "+ prezzo);
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
        super.mostra_dettagli();
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
        super.mostra_dettagli();
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
        super.mostra_dettagli();
        System.out.println("piega_decorativa: "+piega_decorativa);
    }
}



