interface Haburger
{
    String getDescrizione();
    double getPrezzo();
}
//Classe Concreta
class BaseBurger implements Haburger
{
          public String getDescrizione()
          {
            return "Hamburger base";
          }

         public double getPrezzo()
         {
            return 5.00;
         }
}

abstract class BurgerDecorator implements Haburger {
    protected Haburger burger;

    public BurgerDecorator(Haburger burger) {
        this.burger = burger;
    }
}



class FormaggioDecorator extends  BurgerDecorator
{   
     public FormaggioDecorator(Haburger burger) {
        super(burger);
    }

    public String getDescrizione()
          {
            return burger.getDescrizione()+" + "+"Formaggio";
          }
    public double getPrezzo()
    {
        return burger.getPrezzo()+0.50;
    }

}

class BaconDecorator extends  BurgerDecorator
{
     public BaconDecorator(Haburger burger) {
        super(burger);
    }

     public String getDescrizione()
          {
            return burger.getDescrizione()+" + "+"Bacon";
          }


    public double getPrezzo()
    {
        return burger.getPrezzo()+0.80;
    }
}


