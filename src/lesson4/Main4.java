package lesson4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // порядковый номер, страна, колво дней, самолет или поезд, цена, количество звезд,
        // питание (пансионат полупансионат), трансфер (да нет)
        String[][] tours = {{"1", "Италия", "5 дней", "самолет", "100000", "5 звезд", "пансионат", "да"},
                {"2", "Франция", "7 дней", "поезд", "30000", "4 звезды", "пансионат", "да"},
                {"3", "Албания", "10 дней", "самолет", "50000", "3 звезды", "полупансионат", "нет"},
                {"4", "Турция", "14 дней", "самолет", "80000", "4 звезды", "пансионат", "да"},
                {"5", "Греция", "8 дней", "самолет", "120000", "5 звезд", "пансионат", "да"},
                {"6", "Италия", "12 дней", "автобус", "10000", "2 звезды", "полупансионат", "нет"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну: ");
        String country = scanner.nextLine();

        System.out.println("На какой бюджет ориентируетесь?");
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr);


        System.out.println("Вы можете поехать в эти туры: ");
        for (int i = 0; i < tours.length; i++) {
            int costTour = Integer.parseInt(tours[i][4]);
            if (country.equalsIgnoreCase(tours[i][1]) && costTour > money - 20000 && costTour < money + 20000) {
                System.out.printf("%s. %s: %s, %s, за %s руб, %s, %s, трансфер - %s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6], tours[i][7]);
            }

        }

        // напечатать на консоль
        // 1) туры в ... страну только пансионат
        // 2) туры в ... страну от .. звезд и выше
        // 3) туры в любые страны от .. бюджета до .. бюджета
        // 4) среднюю стоимость тура нашего турагенства


        // 1) туры в ... страну только пансионат
        System.out.println("Туры в выбранную страну с трехразовым питанием");
        for (int i = 0; i < tours.length; i++) {

            if (country.equalsIgnoreCase(tours[i][1]) && tours[i][6] == "пансионат") {
                System.out.printf("%s. %s: %s, %s, за %s руб, %s, %s, трансфер - %s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6], tours[i][7]);
            }
        }

        // 2) туры в ... страну от .. звезд и выше
        System.out.println("Отель с каким количеством звезд хотите?");
        String starsHotel = scanner.nextLine();
        System.out.println("Туры в выбранную страну с желаемым уровнем комфорта");
        for (int i = 0; i < tours.length; i++) {
            int stars = Integer.parseInt(starsHotel);
            String[] starsByWords = tours[i][5].split("\\s+");
            int starsInt = Integer.parseInt(starsByWords[0]);

            if (country.equalsIgnoreCase(tours[i][1]) && stars <= starsInt) {
                System.out.printf("%s. %s: %s, %s, за %s руб, %s, %s, трансфер - %s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6], tours[i][7]);
            }
        }
        // 3) туры в любые страны от .. бюджета до .. бюджета
        System.out.println("Укажите желаемый бюджет");
        System.out.println("от");
        String moneyFrom = scanner.nextLine();
        System.out.println("до");
        String moneyTo = scanner.nextLine();
        int moneyFromInt = Integer.parseInt(moneyFrom);
        int moneyToInt = Integer.parseInt(moneyTo);
        System.out.println("Туры в указанном ценовом диапазоне");
        for (int i = 0; i < tours.length; i++) {
            int costTour = Integer.parseInt(tours[i][4]);
            if (costTour >= moneyFromInt && costTour <= moneyToInt) {
                System.out.printf("%s. %s: %s, %s, за %s руб, %s, %s, трансфер - %s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6], tours[i][7]);
            }
        }

        // 4) среднюю стоимость тура нашего турагенства
        System.out.println("Средняя стоимость тура в нашем турагенстве :");
        int averageCost = 0;
        for (int i = 0; i < tours.length; i++) {
            int costTour = Integer.parseInt(tours[i][4]);
            averageCost = averageCost + costTour;
        }
        System.out.println(averageCost / tours.length);
    }
}
