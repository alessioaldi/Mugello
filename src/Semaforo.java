public class Semaforo {
    private int valore;

    /**
     * 
     * @param valore
     * costruttore del semaforo
     */
    public Semaforo(int valore) {
        this.valore = valore;
    }

    /**
     * prova se il semaforo è libero o meno
     */
    public synchronized void P(){
        while (valore==0){
            try{
                System.out.println("--------------"+Thread.currentThread().getName()+"attende in fila-------------");
                wait();
            } catch(Exception e){
                System.out.println("qualcosa è andato storto");
            }

        }

        valore--;
    }


    /**
     * libera il semaforo
     */
    public synchronized void V(){
        valore++;
        notify();
    }
}
