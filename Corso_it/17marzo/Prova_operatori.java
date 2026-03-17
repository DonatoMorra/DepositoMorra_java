public class Prova_operatori {
    public class Main {
        public static void main(String[] args) {
            
            int x=100+50;
            int sum1=x;
            int sum2=sum1+250;
            int sum3=sum2+sum2;

            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum3);


            /*operatori logici
            AND && 
            OR ||
            NOT !()
            */

           
            /* operatori di assegnazione
            +
            -
            *
            /
            %
            ++
            --
            */
             
            /*
            operatori di confronto
            == uguala a
            != non uguale a
            > maggiore
            < minore
            >= maggiore uguale a
            <= minore uguale a
            */

            //esercizi operatori di assegnazione
            int numero =20;
            numero+=15;
            numero-=5;
            numero*=2;
            numero/=7;


            int num=10;
            //prima stampa il numero originale e poi stampa il numero incrementato
            System.out.println(num++);
            
            //prima stampa il numero incrementato e poi stampa il numero originale
            System.out.println(++num);


            //prova operatori logici
            System.out.println(num<10 && num>5);
            System.out.println(num<10 || num>5);
            System.out.println(!(num<10));



        }
    }
}
