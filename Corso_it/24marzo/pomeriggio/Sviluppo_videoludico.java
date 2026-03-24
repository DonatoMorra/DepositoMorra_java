import java.util.Scanner;

public class Sviluppo_videoludico {
    public static void main(String[] args) {

        Scanner myint = new Scanner(System.in);
         Scanner mystr = new Scanner(System.in);

        
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3  = new Team("Team 3");

        boolean continua = true;

        while (continua) {
            System.out.println("---Menu---");
            System.out.println("1 - Assegna gioco a un team");
            System.out.println("2 - Visualizza tutti i team");
            System.out.println("3 - Cerca il gioco con costo di sviluppo alto");
            System.out.println("4 - Modifica stato di un gioco");
            System.out.println("5 - aggiungi sviluppatori a un team");
            System.out.println("6 - Esci");

            System.out.print("Scegli opzione: ");
            int op = myint.nextInt();
            

            switch (op) 
            {
                case 1:
                    System.out.print("Scegli il team (1-3): ");
                    int tem = myint.nextInt();
                    

                    System.out.print("Inserisci Titolo: ");
                    String titolo = mystr.nextLine();

                    System.out.print("Inserisci genere: ");
                    String genere = mystr.nextLine();

                    System.out.print("Inserisci costo sviluppo: ");
                    int csv = myint.nextInt();

                    System.out.println("Dimmi stato del progetto");
                    String stp=mystr.nextLine();
                    

                    Gioco newGioco = new Gioco(titolo, genere, csv, stp);

                    switch (tem) {
                        case 1: team1.gioco = newGioco;
                                break;

                        case 2: team2.gioco = newGioco;
                                  break;

                        case 3:  team3.gioco = newGioco;
                                 break;

                        default: System.out.println("Team non esistente");
                        
                    }

                    System.out.println("Dati inseriti ");
                    break;

                case 2:
                    team1.stampaNegozio();
                    team2.stampaNegozio();
                    team3.stampaNegozio();
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


    
    static class Gioco {
        String titolo,genere;
        double costo_sviluppo;
        String stato_del_progetto;

        Gioco(String titolo,String genere, double costo_sviluppo, String stato_del_progetto) {
            this.titolo = titolo;
            this.genere = genere;
            this.costo_sviluppo = costo_sviluppo;
            this.stato_del_progetto =stato_del_progetto;
        }

        void stampaProdotto() {
            System.out.println("Titolo: " + titolo);
            System.out.println("Genere: "+ genere);
            System.out.println("Prezzo: " + costo_sviluppo);
            System.out.println("Stato del progetto: " + stato_del_progetto);
        }
    }

    static class Team {
        String nome_Team;
        String nome_sviluppatori;
        Gioco gioco;

        Team(String nome_team) 
        {
            this.nome_Team = nome_team;
        }

        void stampaNegozio() {
            System.out.println("Nome Team: " + nome_Team + "Nome sviluppatori: " + nome_sviluppatori);
            System.out.println("--------------------------------------------");
            
        }
    }
}