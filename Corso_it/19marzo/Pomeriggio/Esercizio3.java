public class Esercizio3 {
    
    public static void main(String[] args) {


        System.out.println(somma(5, 10));

        System.out.println(multiply(5,5, 6.5));

        System.out.println(sommaNaturali(5));

        System.out.println(variabileprimitiva(5.50));


    }
    //somma
    static int somma(int a , int b)
    {
            return a+b;
    }

    //multiply int 2 valori
    static int multiply(int a , int b )
    {
        return a * b;
    }
    //multiply double 3 valori
    static double multiply(double a,double b,double c)
    {
        return  a * b * c;
    }

    //somma naturale
    static int sommaNaturali(int n)
    {   
        //se 1 ritorna 1 semplicemente
        if(n==1)
        {
            return 1;
        }
        //riprendo questo metodo per sottrarre
        return n+sommaNaturali(n-1);


    }

    //conversione double a int
    static int variabileprimitiva(double a)
    {
        return (int) a;
    }

    //manca esercizio array



}
