//sottosistema
class SubsystemA {
    public void operationA()
    {
        System.out.println("Operazione A del sottosistema A");
    }
}
class SubsystemB {
    public void operationB() {
        System.out.println("Operazione B del sottosistema B");
    }
}
//facade
class Facade { 

    private SubsystemA a=new SubsystemA();
    private SubsystemB b=new SubsystemB();

    public void operaizoneUnificata() {
        a.operationA();
        b.operationB();
    }
}

