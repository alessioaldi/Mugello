

public class Macchina extends Thread{
    private int id;
    private String scuderia;
    private String pilota;
    private Semaforo s;
    private Box b;

    /**
     * 
     * @param id 
     * @param scuderia
     * @param pilota
     * @param s
     * @param b
     * 
     * costruttore della classe macchina
     */
    public Macchina(int id, String scuderia, String pilota, Semaforo s, Box b) {
        super(pilota);
        this.id = id;
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.s = s;
        this.b = b;
    }

    /**
     * istruzioni del thread
     */
    public void run(){

        System.out.println(pilota+" inizia la gara");

        for(int i = 0; i < 10; i++){
            int pausa= (int) Math.random()*4000+1000;
            try{
                sleep(pausa);
            } catch( Exception e){
                System.out.println(e.getMessage());
            }

            if(i%3==0){
                System.out.println(pilota+" deve cambiare le gomme");
                s.P();

                b.pitstopEnter();
                try{
                    sleep((int) Math.random()*5000+1000);
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
                b.pitstopExit();

                s.V();
            }

            b.completaGiro(i);
        }

        b.fineGara();
    }


}
