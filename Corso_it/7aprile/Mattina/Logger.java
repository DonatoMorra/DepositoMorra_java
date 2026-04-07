
import java.time.LocalDateTime;

public class Logger 
{

    
private static Logger instanza;


private Logger(){}


public static Logger getInstanza()
{

    if(instanza==null)
    {
        instanza=new Logger();
    }
    
    return instanza;    
}



public void ScriviMessaggio(String messaggio)
{
    System.out.println("\nOra e Data: "+LocalDateTime.now()+"\nMessaggio: "+messaggio);
}

    
    
}
