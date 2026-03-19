public class Prova_funzioni {
    public static void main(String[] args)
    {
        saluta();//chiamata del metodo

         System.out.println(somma(10, 20));//Outout: 30
         mostra(10); //chiamata mostra int
         mostra("Ciao"); //chiamata mostra string
        
         int[] numeri={1,2,3};
         modifica(numeri);
         System.out.println(numeri[0]);


    }
    
    static void saluta()
    {
        System.out.println("Hello Word");

           
    }

    static int somma(int a, int b)
    {
        return a+b;
    }

    static void mostra(int numero)
    {
        System.out.println("Numero: " + (10 + numero));
    }
    static void mostra(String testo)
    {   
        System.out.println("Testo: " + testo);
    }

    int fattoriale(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fattoriale(n-1);
    }


    static void modifica(int[] arr)
    {
        arr[0]=99; //questa modifica sarà visibile all'esterno
    }
    


}
