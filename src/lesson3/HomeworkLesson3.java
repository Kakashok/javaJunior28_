package lesson3;

import java.util.Scanner;

public class HomeworkLesson3 {
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
                System.out.println("Окружность круга: " + (2 * Math.PI * r));
            }

        } else if (figure.equalsIgnoreCase("овал") || figure.equals("2")) {
            System.out.println("Периметр или площадь?");
            String action = scanner.nextLine();
            System.out.println("Введите большую полуось: ");
            String bolshayaOs = scanner.nextLine();
            System.out.println("Введите малую полуось: ");
            String malayaOs = scanner.nextLine();
            int a = Integer.parseInt(bolshayaOs);
            int b = Integer.parseInt(malayaOs);
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь овала: " + (a * b * Math.PI));
            } else {
                System.out.println("Периметр овала: " + (4 * ((Math.PI * a * b + (a - b)) / (a + b))));
            }

        } else if (figure.equalsIgnoreCase("квадрат") || figure.equals("3")) {
            System.out.println("Периметр или площадь?");
            String action = scanner.nextLine();
            System.out.println("Введите сторону: ");
            String storona = scanner.nextLine();
            int a = Integer.parseInt(storona);
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь квадрата: " + (a * a));
            } else {
                System.out.println("Периметр квадрата: " + (a * 4));
            }

        } else if (figure.equalsIgnoreCase("треугольник") || figure.equals("4")) {
            System.out.println("Периметр или площадь?");
            String action = scanner.nextLine();
            System.out.println("Введите первый катет: ");
            String katet1 = scanner.nextLine();
            System.out.println("Введите второй катет: ");
            String katet2 = scanner.nextLine();
            int a = Integer.parseInt(katet1);
            int b = Integer.parseInt(katet2);
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь треугольника: " + (a * b) / 2);
            } else {
                System.out.println("Введите гипотенузу: ");
                String gipotenyza = scanner.nextLine();
                int c = Integer.parseInt(gipotenyza);
                System.out.println("Периметр треугольника: " + (a + b + c));
            }


        } else if (figure.equalsIgnoreCase("трапеция") || figure.equals("5")) {
            System.out.println("Периметр или площадь");
            String action = scanner.nextLine();
            System.out.println("Введите длину первого основания: ");
            String osnovanie1 = scanner.nextLine();
            System.out.println("Введите длину второго основания: ");
            String osnovanie2 = scanner.nextLine();
            int a = Integer.parseInt(osnovanie1);
            int b = Integer.parseInt(osnovanie2);
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Введите высоту трапеции: ");
                String height = scanner.nextLine();
                int h = Integer.parseInt(height);
                System.out.println("Площадь трапеции: " + ((a + b) / 2 * h));
            } else {
                System.out.println("Введите длину первой стороны трапеции: ");
                String storona1 = scanner.nextLine();
                System.out.println("Введите длину второй стороны трапеции: ");
                String storona2 = scanner.nextLine();
                int c = Integer.parseInt(storona1);
                int d = Integer.parseInt(storona2);
                System.out.println("Периметр трапеции: " + (a + b + c + d));
            }


        } else {
            System.out.println("Такой фигуры нет");

        }

    }
}
