package lesson2;

public class Main3 {
    public static void main(String[] args) {
        //напечатать на консоль цифры от 100 до 200, которые делятся на 3 и на 5

        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);

            }

        }
    }
}
