public class Esempi_matematica{
    public static void main(String[] args) {
    
        Math.max(5, 10); //valore piu alto
        Math.min(5,10); //valore piu basso
        Math.sqrt(64); //restituisce la radice quadrata
        Math.abs(-4.7);//restituisce il valore assoluto(positivo)
        Math.random();//restituisce un numero casuale
        
        
        //per ottenere un maggiore controllo sul numero casuale es. se vogliamo un numero tra 0 e 100 si puo usare:

        int randomNum=(int)(Math.random()*101);
        System.out.println(randomNum);

        




    }   
    
}
