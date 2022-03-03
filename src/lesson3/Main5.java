package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // фигура, площадь или периметр, сторона

        System.out.println("Выберете фигуру: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Овал");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Треугольник");
        System.out.println("5 - Трапеция");

        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equalsIgnoreCase("круг") || figure.equals("1")) {
            System.out.println("Окружность или площадь?");
            String action = scanner.nextLine();
            System.out.println("Введите радиус круга: ");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (r * r)));

            } else {
                System.out.println("Площадь круга: " + (2 * Math.PI * r));


            }

        } else if (figure.equalsIgnoreCase("овал") || figure.equals("2")) {

        } else if (figure.equalsIgnoreCase("квадрат") || figure.equals("3")) {

        } else if (figure.equalsIgnoreCase("треугольник") || figure.equals("4")) {

        } else if (figure.equalsIgnoreCase("трапеция") || figure.equals("5")) {

        } else{

        }

    }
}
