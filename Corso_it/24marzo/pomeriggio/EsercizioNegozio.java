import java.util.Scanner;

public class EsercizioNegozio {
    public static void main(String[] args) {

        Scanner myint = new Scanner(System.in);
         Scanner mystr = new Scanner(System.in);

        
        Negozio neg1 = new Negozio("Negozio 1");
        Negozio neg2 = new Negozio("Negozio 2");
        Negozio neg3 = new Negozio("Negozio 3");

        boolean continua = true;

        while (continua) {
            System.out.println("---Menu---");
            System.out.println("1 - Inserisci Prodotto negozio");
            System.out.println("2 - Visualizza dati di tutti i negozi");
            System.out.println("3 - Cerca il negozio con il prodotto più costoso");
            System.out.println("4 - Modifica quantità di un prodotto");
            System.out.println("5 - Vendi prodotti da un negozio");
            System.out.println("6 - Esci");

            System.out.print("Scegli opzione: ");
            int op = myint.nextInt();
            

            switch (op) 
            {
                case 1:
                    System.out.print("Scegli il negozio (1-3): ");
                    int neg = myint.nextInt();
                    

                    System.out.print("Inserisci nome prodotto: ");
                    String nome = mystr.nextLine();

                    System.out.print("Inserisci prezzo: ");
                    double prezzo = myint.nextDouble();

                    System.out.print("Inserisci quantità disponibile: ");
                    int qta = myint.nextInt();
                    

                    Prodotto newProdotto = new Prodotto(nome, prezzo, qta);

                    switch (neg) {
                        case 1: neg1.prodotto = newProdotto;
                                break;

                        case 2: neg2.prodotto = newProdotto;
                                  break;

                        case 3:  neg3.prodotto = newProdotto;
                                 break;

                        default: System.out.println("Negozio non esistente");
                        
                    }

                    System.out.println("Prodotto inserito ");
                    break;

                case 2:
                    neg1.stampaNegozio();
                    neg2.stampaNegozio();
                    neg3.stampaNegozio();
                    break;

                case 3:
                    

                case 4:
                   

                case 5:
                    

                case 6:
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;

                default:
                    System.out.println("Opzione non valida");
            }
        }

       
    }


    
    static class Prodotto {
        String nome;
        double prezzo;
        int quantita_disponibile;

        Prodotto(String nome, double prezzo, int quantita_disponibile) {
            this.nome = nome;
            this.prezzo = prezzo;
            this.quantita_disponibile = quantita_disponibile;
        }

        void stampaProdotto() {
            System.out.println("Nome Prodotto: " + nome);
            System.out.println("Prezzo: " + prezzo);
            System.out.println("Quantità disponibile: " + quantita_disponibile);
        }
    }

    static class Negozio {
        String nome_negozio;
        Prodotto prodotto;

        Negozio(String nome_negozio) 
        {
            this.nome_negozio = nome_negozio;
        }

        void stampaNegozio() {
            System.out.println("Negozio: " + nome_negozio + "Prodotti:\n " + "Nome: "+prodotto.nome +" Prezzo: "+ prodotto.prezzo + "Quantita: " + prodotto.quantita_disponibile);
            System.out.println("--------------------------------------------");
            
        }
    }
}