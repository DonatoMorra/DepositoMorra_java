package Esercizio_Serio_facade.Decorator;
//classe che implementa l'interfaccia computer e rappresenta un computer base ufficio
class ComputerBaseUfficio implements Computer
{
    @Override
    public String getDescrizione() {
        return "Computer Base Ufficio";
    }

    @Override
    public double getPrezzo() {
        return 500.0;
    }
}