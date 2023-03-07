public class HilosEjemplo {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
       Hilo3Cancion hilo3 = new Hilo3Cancion();

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
