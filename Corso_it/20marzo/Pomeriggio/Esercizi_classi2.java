public class Esercizi_classi2 
{
    public static void main(String[] args) 
    {
        //creazione oggetto 1
        Persona pers=new Persona("Donato",24,"Salerno");
        //creazione oggetto 2
        Persona pers1= new Persona("Giorgio", 99, "Napoli");
        
        //Output
        pers.visualizza();
        pers1.visualizza();
    }
}







    //Creazione esterna di una classe persona con costruttore
 class Persona
    {
        String nome;
        int eta;
        String citta;
        


        Persona( String nome , int eta, String citta)
        {
            this.nome=nome;
            this.eta=eta;
            this.citta=citta;
            
        }

        //Stampa intena
        void visualizza()
        {
            System.out.println(this.nome+ " - " + this.eta +" - "+this.citta);
            System.out.println("-------------------------");
        }
    }
