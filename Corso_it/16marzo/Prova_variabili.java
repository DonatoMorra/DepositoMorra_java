

public class Prova_variabili {
    public static void main(String[] args)
    {
        //variabile contiene nome tipo valore 
        //i tipi primitivi sono:
        //char
        //String
        String provaTesto="Ciao Mondo\n";
        System.out.print(provaTesto);
        //int
        int provaNumerica=12;
        System.out.println(provaNumerica);
        //float numeri decimali con la virgola
        //boolean
        boolean provaBool=true;
        System.out.println(provaBool);

        //Stampa concatenata
       String testo="Prova";
       System.out.println("Questo e una "+testo);

       //Stampa concatenata dentro ad una stringa
       String testo2="Prova"+"numero due";
       System.out.println(testo2);
       
       //Stampa concatenata con due stringhe
       String firstPart="Ciao ";
       String secondPart="Mondo";
       System.out.println(firstPart+secondPart);

      //Stampa due interi
      int x=5;
      int y=6;
      System.out.println(x+y);

    //stampo la somma di x y z
      int x1=5, y1=6, z=50;
      System.out.println(x1+y1+z);

      int x2, y2 ,z1;
      x2=y2=z1=50;
        System.out.println(x2);

        //comando che prende un singolo carattere
        String test="Tonypitoni";
        System.out.println(test.charAt(0));


    }
}
