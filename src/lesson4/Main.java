package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 366; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int minute = 0; minute < 60; minute++) {
                    for (int sec = 0; sec < 60; sec++) {
                        // выполнится сколько раз = 366 * 24 * 60 * 60
                        System.out.printf("Со старта прошло %d дня, %d часа, %d минуты, %d секунды \n", day, hour, minute, sec);
                        Thread.sleep(1000);
                    }
                }
            }

        }
    }

}
