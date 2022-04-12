package lesson19;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 100000; i < 100200; i++){
            System.out.println(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
