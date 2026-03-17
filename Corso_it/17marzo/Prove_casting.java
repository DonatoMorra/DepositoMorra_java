public class Prove_casting
{
    public static void main(String[] args) {

        //coercizione

        int myint=9;
        double myDouble = myint; //casting automatico: int to double

        System.out.println(myint); //Outputs 9
        System.out.println(myDouble); //Outputs 9.0

        //Casting

        double myDouble1=9.78d;
        int myint1=(int)myDouble1; //casting manuale: double to int

        System.out.println(myDouble1); //Outputs 9.78
        System.out.println(myint1); //Outputs 9

        
        

    }

}