package lesson19;

public class SecondThread extends Thread{
    @Override
    public void run() {
        for (int i = 100; i < 200; i++){
            System.out.println(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
