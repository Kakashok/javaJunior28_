package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // посчитать ежемесячный доход от вклада под годовые проценты

        double money = 10000000;
        int year = 5;
        int percent = 7;

        for(int month = 0; month < 12*year; month++){
            money = money + (((money/100)*percent) /12);

        }
        System.out.println(money);
    }
}