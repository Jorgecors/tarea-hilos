class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 65; i <= 90; i++) {
            char letra = (char) i;
            System.out.println("Hilo 2: " + letra);
            
        }
    }
}