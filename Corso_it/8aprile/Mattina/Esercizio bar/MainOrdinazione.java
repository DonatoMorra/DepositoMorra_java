
import java.util.Scanner;

public class MainOrdinazione {
    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);
        Scanner myStr = new Scanner(System.in);

        GestoreOrdini gestore = GestoreOrdini.getIstanza();
        Bevanda bevandaCorrente = null;

          /* 
        Bevanda bevanda=new caffe();
        bevanda = new ZuccheroDecorator(bevanda);
        bevanda = new CannellaDecorator(bevanda);

        System.out.println(bevanda.getDescrizione());
        System.out.println("Prezzo: " + bevanda.getPrezzo());
        */


        boolean continua = true;

        while (continua) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Crea una nuova bevanda");
            System.out.println("2. Aggiungi ingredienti extra");
            System.out.println("3. Visualizza bevanda corrente");
            System.out.println("4. Conferma ordine");
            System.out.println("5. Visualizza storico ordini");
            System.out.println("0. Esci");

            System.out.print("Scelta: ");
            int scelta = myInt.nextInt();
            

            switch (scelta) {

                case 1: 
                // CREA NUOVA BEVANDA
                    System.out.println("Seleziona bevanda base:");
                    System.out.println("1. Caffè");
                    System.out.println("2. Tè");
                    System.out.println("3. Cioccolata calda");

                    System.out.print("Scelta: ");
                    int base = myInt.nextInt();
                    

                    switch (base) {
                        case 1: bevandaCorrente = new caffe(); break;
                        case 2: bevandaCorrente = new te(); break;
                        case 3: bevandaCorrente = new Cioccolata(); break;
                        default: 
                            System.out.println("Bevanda non valida");
                            bevandaCorrente = null;
                    }

                    if (bevandaCorrente != null) {
                        System.out.println("Hai creato: " + bevandaCorrente.getDescrizione());
                    }
                    break;

                case 2: 
                // AGGIUNGI INGREDIENTI EXTRA
                    if (bevandaCorrente == null) {
                        System.out.println("Prima devi creare una bevanda");
                        break;
                    }

                    boolean cont = true;
                    while (cont) {
                        System.out.println("Scegli ingrediente extra: ");
                        System.out.println("1. Latte");
                        System.out.println("2. Zucchero");
                        System.out.println("3. Panna");
                        System.out.println("4. Cannella");
                        System.out.println("5. Fine");

                        System.out.print("Scelta: ");
                        int extra = myInt.nextInt();
                        myInt.nextLine();

                        switch (extra) {
                            case 1: bevandaCorrente = new LatteDecorator(bevandaCorrente); break;
                            case 2: bevandaCorrente = new ZuccheroDecorator(bevandaCorrente); break;
                            case 3: bevandaCorrente = new PannaDecorator(bevandaCorrente); break;
                            case 4: bevandaCorrente = new CannellaDecorator(bevandaCorrente); break;
                            case 5: cont = false; break;
                            default: System.out.println("Ingrediente non valido"); 
                        }
                    }
                    break;

                case 3: 
                // VISUALIZZA BEVANDA 
                    if (bevandaCorrente == null) {
                        System.out.println("Nessuna bevanda creata ");
                    } else {
                        System.out.println("Bevanda corrente: " + bevandaCorrente.getDescrizione());
                        System.out.println("Prezzo: " + bevandaCorrente.getPrezzo());
                    }
                    break;

                case 4: 
                // CONFERMA ORDINE
                    if (bevandaCorrente == null) {
                        System.out.println("bevanda insesistente");
                    } else {
                        gestore.aggiungi(bevandaCorrente);
                        bevandaCorrente = null; 
                    }
                    break;

                case 5: 
                    gestore.mostraStorico();
                    break;

                case 0:
                    System.out.println("Arrivederci");
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }

        myInt.close();
        myStr.close();
    }
}