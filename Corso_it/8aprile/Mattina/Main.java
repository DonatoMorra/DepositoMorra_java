public class Main {

    public static void main(String[] args) 
    {

        Messaggio messaggio = new MessaggioBase();
            System.out.println(messaggio.getContenuto());

            Messaggio messaggioMaiuscola =new DecoratoreMaiuscolo(messaggio);
            System.out.println(messaggioMaiuscola.getContenuto());
            
    }

     
    
}
