public class Box {
    

    public void pitstopEnter(){
        System.out.println("pit stop "+Thread.currentThread().getName()+" entra");
    }

    public void pitstopExit(){
        System.out.println("pit stop "+Thread.currentThread().getName()+" esce");
    }

    public void completaGiro(int giro){
        giro++;
        System.out.println(Thread.currentThread().getName()+" completa giro "+ giro);
    }

    public void fineGara(){
        System.out.println(Thread.currentThread().getName()+" completa la gara");
    }
}
