import java.util.ArrayList;
import java.util.Scanner;

public class GestioneScuola {
    public static void main(String[] args) 
    {
         Scanner myint = new Scanner(System.in);
         Scanner mystr = new Scanner(System.in);

        ArrayList<Studente> studenti = new ArrayList<>();
        ArrayList<Docente> docenti = new ArrayList<>();

        boolean continua=true;

        while (continua) 
        {
            System.out.println("1 - Crea Docente");
            System.out.println("2 - Crea Studente");
            System.out.println("3 - Assegna voto");
            System.out.println("4 - Stampa voti studente");
            System.out.println("5 - Esci");

            System.out.println("Cosa vuoi fare?");
            int scelta = myint.nextInt();
            
            switch (scelta) {
                case 1:
                //creo prima il docente 
                    System.out.print("Inserisci Nome: ");
                    String nomed = mystr.nextLine();
                    System.out.print("Inserisci Età: ");
                    int etad = myint.nextInt();
                    System.out.print("Inserisci Materia: ");
                    String materia = mystr.nextLine();

                    docenti.add(new Docente(nomed, etad, materia));
                    break;        
                case 2: 
                //creo Studente
                    System.out.print("Inserisci Nome: ");
                    String nomes = mystr.nextLine();
                    System.out.print("Inserisci Età: ");
                    int etas = myint.nextInt();
                    System.out.print("Inserisci Classe: ");
                    String classe = mystr.nextLine();

                    Studente stu=new Studente(nomes, etas, classe);
                    studenti.add(stu);

                    //assegno lo studente al docente solo se il docente esiste
                      if(docenti.isEmpty()) 
                    {
                        System.out.println("Docenti non esistono");
                    }   
                    else
                    {
                        //Visualizzo tutti i docenti esistenti
                         for(int i = 0; i < docenti.size(); i++) {
                            System.out.println(i + " - " + docenti.get(i).getNome());
                        }
                        

                         System.out.println("Seleziona docente a cui assegnare lo studente:");
                         int in = myint.nextInt();
                         
                       
                        // se il docente e presente nella lista docenti
                        if(in >= 0 && in < docenti.size()) 
                        {   
                            //aggiungo al docente con indice lo studente
                            docenti.get(in).aggiungiStudente(stu);
                            break;
                        }    
                        else
                        {   
                            //se l'indice del docente non esiste
                            System.out.println("Docente inesistente");
                            break;
                        }
                    }
                     break;
                case 3: 

                    if(docenti.isEmpty() && studenti.isEmpty())
                    {
                        System.out.println("Docente o Studente inesistente");
                        break;
                    }
                    
                    System.out.println("Lista Docenti: ");
                    //Visualizzo tutti i docenti esistenti
                for(int i = 0; i < docenti.size(); i++) 
                    {
                        System.out.println(i + " - " + docenti.get(i).getNome());
                        System.out.println("-------------------------");
                    }
                    //scelta utente docente in base all'indice
                        System.out.println("Seleziona docente:");
                        int d = myint.nextInt();
                            
                if(d < 0 || d >= docenti.size()) 
                    {
                        System.out.println("Docente non valido.");
                        break;
                    }
                else
                {
                    System.out.println("Hai scelto il docente");
                    Docente docSel = docenti.get(d);
                    
                    //Visualizzo tutti i Studenti esistenti
                    System.out.println("Lista Studenti: ");
                    for(int i = 0; i < studenti.size(); i++) 
                    {
                        System.out.println(i + " - " + studenti.get(i).getNome());
                        System.out.println("-------------------------");
                    }
                        //Scelta utente assegnare il voto
                     System.out.println("A quale studente vuoi dare il voto?: ");
                    int stud=myint.nextInt();

                    //se mette un numero minore a 0 o maggiore agli studente esistenti
                     if(d < 0 || d >= studenti.size()) 
                    {
                        System.out.println("Studente non trovato.");
                        break;
                    }
                    else
                    {
                        //assegno un voto a studente selezionato
                        System.out.println("Quale vuoto vuoi inserire? ");
                        int voto=myint.nextInt();

                        docSel.assegnaVoto(studenti.get(stud), voto);
                        System.out.println("Voto inserito");
                    }


                }

               


                case 4:
                         if (studenti.size() == 0) break;

                    //visualizzo tutti gli studenti
                    for (int i = 0; i < studenti.size(); i++) {
                        System.out.println(i + " - " + studenti.get(i).getNome());
                        System.out.println("------------------------------");
                    }

                    System.out.println("Seleziona studente:");
                    int index = myint.nextInt();

                    //controllo se studenti non ci sono 
                    if(index < 0 || index >= studenti.size()) {
                        System.out.println("Studente non valido.");
                        break;
                    }
                    else
                    {
                        //vedo i voti dei studenti
                    studenti.get(index).stampaVoti();
                    }
                    break;

                case 5:
                    System.out.println("Arrivederci");
                    continua=false;
                    break;
                    
                default:
                    System.out.println("Caso non trovato");
            }


            
        }

        myint.close();
        mystr.close();




    }
}