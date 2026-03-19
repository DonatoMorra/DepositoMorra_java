
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Esercizi_arrayList {
    public static void main(String[] args) {
  
        Scanner mystr=new Scanner(System.in);
         Scanner myint=new Scanner(System.in);
        //creo arrayList
        ArrayList<String> nomi =new ArrayList<>();
        boolean continua=true;

        
        while (continua) 
        {   
            //chiedo utente di aggiungere nome 
            System.out.println("Vuoi aggiungere nome?: (fine per non aggiungere nomi)");
            String nome=mystr.nextLine();

            
            //se utente scrive fine esco
             if(nome.equalsIgnoreCase("fine"))
             {
                continua=false;
                break;
             }  

                nomi.add(nome); 
               
        }   
            //numeri studenti inseriti
            System.out.println("Studenti inseriti: "+nomi.size()); 
             Collections.sort(nomi);

                //stampo nomi alfabetico
                System.out.println("Nomi in ordine alfabetico: "+nomi);

            while (continua)
                {

                    System.out.println("Quali studenti vuoi eliminare scrivi numero?: (0 per non eliminare nomi)");
                    int num=myint.nextInt();

                     if(num==0)
                {
                continua=false;
                } 

                    for(int i=0; i<nomi.size();i++)
                    {
                        System.out.println( i +"-"+nomi.size());
                    }
                } 
                

        }
    }
    

