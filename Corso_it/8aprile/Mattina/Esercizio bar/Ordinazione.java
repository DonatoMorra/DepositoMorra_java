interface Bevanda
{
    String getDescrizione();
    double getPrezzo();
}
//class concreta caffe
class caffe implements Bevanda
{
     @Override
    public String getDescrizione()
          {
            return "Caffe base";
          }
           @Override
         public double getPrezzo()
         {
            return 1.00;
         }

}
class te implements Bevanda
{
     @Override
    public String getDescrizione()
          {
            return "Te base";
          }
           @Override
         public double getPrezzo()
         {
            return 1.50;
         }

}
class Cioccolata implements Bevanda
{
     @Override
    public String getDescrizione()
          {
            return "Cioccolata";
          }
           @Override
         public double getPrezzo()
         {
            return 1.80;
         }

}

abstract class BevandaDecorator implements Bevanda
{   
    protected Bevanda bevanda;

    public BevandaDecorator(Bevanda bevanda) 
    {
        this.bevanda=bevanda;
    }
}

//classe concreta
class LatteDecorator extends BevandaDecorator
{   
     public LatteDecorator(Bevanda bevanda)
      {
        super(bevanda);
      }
       @Override
    public String getDescrizione()
          {
            return bevanda.getDescrizione()+" + "+"Latte";
          }
    public double getPrezzo()
    {
        return bevanda.getPrezzo()+0.10;
    }

}

//classe concreta
class ZuccheroDecorator extends BevandaDecorator
{   
     public ZuccheroDecorator(Bevanda bevanda)
      {
        super(bevanda);
      }

    public String getDescrizione()
          {
            return bevanda.getDescrizione()+" + "+"Zucchero";
          }
    public double getPrezzo()
    {
        return bevanda.getPrezzo()+0.05;
    }
}

//classe concreta
class PannaDecorator extends BevandaDecorator
{   
     public PannaDecorator(Bevanda bevanda)
      {
        super(bevanda);
      }

    public String getDescrizione()
          {
            return bevanda.getDescrizione()+" + "+"Panna";
          }
    public double getPrezzo()
    {
        return bevanda.getPrezzo()+0.15;
    }
}

//classe concreta
class CannellaDecorator extends BevandaDecorator
{   
     public CannellaDecorator(Bevanda bevanda)
      {
        super(bevanda);
      }

    public String getDescrizione()
          {
            return bevanda.getDescrizione()+" + "+"Cannella";
          }
    public double getPrezzo()
    {
        return bevanda.getPrezzo()+0.25;
    }
}