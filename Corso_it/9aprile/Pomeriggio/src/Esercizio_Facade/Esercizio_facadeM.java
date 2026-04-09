package Esercizio_Facade;

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