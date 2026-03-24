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
                    
                    System.out.println("Inserisci nome sviluppatore");
                    String nomsvil=mystr.nextLine();

                    System.out.print("Inserisci Titolo: ");
                    String titolo = mystr.nextLine();

                    System.out.print("Inserisci genere: ");
                    String genere = mystr.nextLine();

                    System.out.print("Inserisci costo sviluppo: ");
                    int csv = myint.nextInt();

                    System.out.println("Dimmi stato del progetto (IN SVILUPPO , IN TEST, PUBLICATO)");
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

                    
                    

                    if(team1.gioco == null)
                    {
                        System.out.println("Team1 non ha giochi inseriti");
                        break;
                    }
                    else
                    {
                        team1.stampaTeam();
                    
                    }

                     if(team2.gioco == null)
                    {
                        System.out.println("Team non esistente");
                        break;
                    }
                    else
                    {
                        team2.stampaTeam();
                        
                    }

                     if(team3.gioco==null)
                    {
                        System.out.println("Team non esistente");
                        break;
                    }
                    else
                    {
                         team3.stampaTeam();
                    }
                    break;

                case 3:
                        
                    Gioco giocomax=null;
                    
                    if (team1.gioco != null) {
                        giocomax = team1.gioco;
                    }

                    
                    if (team2.gioco != null) {
                        if (team2.gioco.costo_sviluppo > giocomax.costo_sviluppo) {
                            giocomax = team2.gioco;
                        }
                    }

                    
                    if (team3.gioco != null) {
                        if (team3.gioco.costo_sviluppo > giocomax.costo_sviluppo) {
                            giocomax = team3.gioco;
                        }
                    }

                    if (giocomax != null) {
                        System.out.println("Il gioco con il costo più alto è:");
                        giocomax.stampaGioco();
                    } else {
                        System.out.println("Nessun gioco inserito");
                    }

                    break;
                case 4:

                    System.out.println("Quale team vuoi modificare lo stato del gioco (1-team1 2-team2 3-team3)");
                    int mod=myint.nextInt();
                    
                    

                    switch (mod) {
                        case 1:
                                System.out.println("Dimmi stato del progetto (IN SVILUPPO , IN TEST, PUBLICATO)");
                                String nuovostato=mystr.nextLine();
                                nuovostato= team1.gioco.stato_del_progetto;

                                System.out.println("Stato aggiornato");

                            break;
                        case 2:

                                System.out.println("Dimmi stato del progetto (IN SVILUPPO , IN TEST, PUBLICATO)");
                                nuovostato=mystr.nextLine();
                                nuovostato= team1.gioco.stato_del_progetto;

                                System.out.println("Stato aggiornato");

                            break;
                        case 3:

                                System.out.println("Dimmi stato del progetto (IN SVILUPPO , IN TEST, PUBLICATO)");
                                nuovostato=mystr.nextLine();
                                nuovostato= team1.gioco.stato_del_progetto;

                                System.out.println("Stato aggiornato");

                            break;
                        default:
                            System.out.println("Team non trovato");
                    }
                    

                   

                case 5:

                        System.out.println("Qui non esiste niente");
                        break;

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

        void stampaGioco() {
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
            this.nome_sviluppatori=nome_sviluppatori;
            this.nome_Team = nome_team;
        }

        void stampaTeam() {
            System.out.println("Nome Team: " + nome_Team + "\n"+
                                "Nome Sviluppatore"+ nome_sviluppatori + "\n"+
                                "Titolo: " + gioco.titolo + "\n"+
                                " Genere: " + gioco.genere + "\n"+
                                "Prezzo per sviluppo: "+gioco.costo_sviluppo + "\n"+
                                 "Stato del progetto: "+gioco.stato_del_progetto);
            System.out.println("--------------------------------------------");
            
        }
    }
}