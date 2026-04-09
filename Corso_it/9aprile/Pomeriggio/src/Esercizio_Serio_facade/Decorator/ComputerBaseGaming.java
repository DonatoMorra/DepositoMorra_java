package Esercizio_Serio_facade.Decorator;
//classe che implementa l'interfaccia computer e rappresenta un computer base gaming
class ComputerBaseGaming implements Computer
{
    @Override
    public String getDescrizione() {
        return "Computer Base Gaming";
    }

    @Override
    public double getPrezzo() {
        return 1000.0;
    }
}