public class Prova_oggetti {
    public static void main(String[] args) {
        
        Auto miaAuto = new Auto(); //creazione oggetto
        miaAuto.marca="Testla"; // assegnazione valore
        miaAuto.anno=2023;
        miaAuto.prezzo=59999.99;

        miaAuto.mostraInfo(); //Output: Tesla - 2023 - €5999.99

    }
}

class Auto
{
    String marca;
    int anno;
    double prezzo;

    void mostraInfo()
    {
        System.out.println(marca +"-" + anno + "- €");
    }

}

class Studente 
{
    String nome;    //variabile di istanza
    static int totaleStudenti=0; //variabile statica

     Studente(String nome) //costruttore
    {
        this.nome=nome;
        totaleStudenti++; //incremento per ogni nuovo oggetto
    }

    


}


