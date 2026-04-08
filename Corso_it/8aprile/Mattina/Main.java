public class Main {

    public static void main(String[] args) 
    {

        Messaggio mg = new MessaggioBase("ciao");
        Messaggio dec = new DecoratoreMaiuscolo(mg);
        System.out.println(dec.getContenuto()); // CIAO


        
        Haburger burger=new BaseBurger();
        burger = new FormaggioDecorator(burger);
        burger = new BaconDecorator(burger);

        System.out.println(burger.getDescrizione());
        System.out.println("Prezzo: " + burger.getPrezzo());

    }

     
    
}
