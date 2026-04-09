package Esercizio_Facade;

//classi che rappresentano i sottosistemi
class Bios
{
   void inizializza()
   {
         System.out.println("Bios Inizializzato");
   }
}
class HardDisk
{
   void Carica()
   {
         System.out.println("HardDisk caricato");
   }
}


class SistemaOperativo
{
    void avvia()
   {
         System.out.println("Sistema Operativo avviato");
   }
}

//classe Facade dove richiamo i metodi dei sottosistemi
class ComputerFacade
{
    void accendiComputer()
    {
        Bios bios=new Bios();
        HardDisk harddisk=new HardDisk();
        SistemaOperativo sistemaoperativo=new SistemaOperativo();

        bios.inizializza();
        harddisk.Carica();
        sistemaoperativo.avvia();
    }

}