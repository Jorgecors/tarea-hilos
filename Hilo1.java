class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 25; i++) {
            System.out.println("Hilo 1: " + i);
            
        }
    }
}