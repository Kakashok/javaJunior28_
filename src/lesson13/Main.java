package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2000,5,2.4,"Золото");
        Coin coin2 = new Coin(2000,5,2.4,"Золото");
        Coin coin3 = new Coin(2020,10,2.6,"Золото");
        Coin coin4 = new Coin(1900,1,2.5,"Серебро");
        Coin coin5 = new Coin(1850,5,1,"Бронза");

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1); // compareTo
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        SortCoins sortCoins = new SortCoins();
        System.out.println("--- Сортровка по диаметру от до --");
        sortCoins.printSortByDiameterFromTo(coins);
        System.out.println("----------------------------------");

        System.out.println("--- Сортровка по диаметру до от --");
        sortCoins.printSortByDiameterToFrom(coins);
        System.out.println("----------------------------------");

        System.out.println("--- Сортровка по номиналу от до --");
        sortCoins.printSortByNominalFromTo(coins);
        System.out.println("----------------------------------");

        System.out.println("--- Сортровка по номиналу до от --");
        sortCoins.printSortByNominalToFrom(coins);
        System.out.println("----------------------------------");

        System.out.println("--- Сортровка по металлу ---------");
        sortCoins.printSortByMetall(coins);
        System.out.println("----------------------------------");


//        for(Coin coin: coins){
//            System.out.println(coin);
//        }
// бинарное дерево, сравнивает методом compareTo. меньше - false. больше - true.
    }
}
