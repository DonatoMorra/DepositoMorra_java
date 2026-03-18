public class Prova_array {
    public static void main(String[] args) {
        
        //dichiarazione e inizializzazione

        int[] valori={1,2,3,4,5};
        //inizializzazione diretta

        int[] numer={10,20,30,40,50};
        System.out.println("primo numero: "+numer[0]);

        int[] numeri=new int[5];
        //Array di dimensione 5

        //Riempimento dell'array con in numeri 1-5
        for(int i=0; i<numeri.length; i++)
        {
            numeri[i]=i+1;
        }
        //stampa degli elementi dell'array
        System.out.println("Elementi dell'array");
        for (int i = 0; i < numeri.length; i++) 
        {
            System.out.println(numeri[i]+ " ");    
        }

            //Array 2D
            int[][] matrice= new int[3][3];

            //inizializzazione diretta
            int[][] matricePredefinita={
            {1,2,3},
            {4,5,6},
            {7,8,9}
            };
        }
    
}
