package lesson19;

public class Vedushiy {
    public static void main(String[] args) {
        System.out.println("Начинаем концерт");

        Singer1 singer1 = new Singer1();
        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);

        singer1.start();
        singer2.start();

        while (singer1.isAlive()){

        }

        //volatile - чтобы избежать подмену оригинала копией

        System.out.println("Концерт окончен");
    }
}
