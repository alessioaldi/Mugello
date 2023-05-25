public class App {
    public static void main(String[] args) throws Exception {
        Semaforo s = new Semaforo(2);
        Box b = new Box();

        Macchina m1 = new Macchina(11, "ferrari", "frero",s , b);
        Macchina m2 = new Macchina(99, "panda 4x4", "giorgione",s , b);
        Macchina m3 = new Macchina(69, "mercedes", "andrew tate",s , b);

        m1.start();
        m2.start();
        m3.start();
    }
}
