
import java.util.Arrays;

public class Prova_stringhe{
    public static void main(String[] args)
    {   
        String txt="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //esempio di lunghezza di una stringa data dal metodo lenght       
        System.out.println("The lenght of the txt string is: "+txt.length());

        String txt1="hello Word";
        //Stringa tutta minuscola
        System.out.println(txt1.toUpperCase());
        //Stringa tutta minuscola 
        System.out.println(txt1.toLowerCase());
        
        //indexOf() restituisce l'indice della prima occorrenza di un testo specificato in una stringa
        String txt2="Please locate where 'locate' occurs! ";
        System.out.println(txt2.indexOf("locate"));

        //concatenazione
        String firstname="John ";
        String lastname="Doe";

        //1 esempio di concatenazione
        System.out.println(firstname+""+lastname);

        //2 esempio di conatenazione con il metodo
        System.out.println(firstname.concat(lastname));

        /*special characters per aggiungere la singola apice funziona solo nelle stringhe
        \' singola apice =(')
        \" doppio apice =(")
        \\ backslash =(\)
        */

        /*
        altri special characters
        \n vai accapo
        \r carriage return
        \t tab
        \b spazio
        \f form feed
        */
        
        //prova caratteri speciali
        System.out.println("Ciao \n come \r stai \t io tutto bene \b non ce male \f veramente");

        //array?
        String str="Hello World";
        String[] words=str.split("\\s");
        System.out.println(Arrays.toString(words));

    }
    
}
