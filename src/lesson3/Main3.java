package lesson3;

public class Main3 {
    public static void main(String[] args) {
        // создать массив длинной в 6 ячеек и заполнить его только четными, начиная от 10

        int[] numbers = new int[6];

//        numbers[0] = 10;
//        numbers[1] = 12;
//        numbers[2] = 14;
//        numbers[3] = 16;
//        numbers[4] = 18;
//        numbers[5] = 20;

        int value = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value = value + 2;
            System.out.println(numbers[i]);
        }
    }
}
