package lesson1;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 4;

        if (a == b && b == c && c == a) {

            System.out.println("Это равносторонний треугольник");

        } else if (a != b && b != c && c != a) {

            System.out.println("Это разносторонний треугольник");

        } else  {
            System.out.println("Это равнобедренный треугольник");

        }

    }
}
