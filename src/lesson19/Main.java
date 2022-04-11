package lesson19;

public class Main {
    public static void main(String[] args) {

        SecondThread secondThread = new SecondThread();
        secondThread.start();

        Thread thread3 = new Thread(new Thread3());
        thread3.start();

        for (int i = 0; i < 100; i++){
            System.out.println(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
