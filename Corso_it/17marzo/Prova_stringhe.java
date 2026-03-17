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
    }
    
}
