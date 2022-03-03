package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int money = 100000;
        int procent = 7;
        int year = 5;
        for (int i = 0; i < year; i++) {
            for (int month = 0; month < 12; month++) {
                money = money + (money / 100 * procent) / 12;
            }

        }
        System.out.println(money);
    }
}
