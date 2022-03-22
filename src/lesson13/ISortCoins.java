package lesson13;

import java.util.TreeSet;

public interface ISortCoins {

    void printSortByDiameterFromTo(TreeSet<Coin> coins);

    void printSortByDiameterToFrom(TreeSet<Coin> coins);

    void printSortByNominalFromTo(TreeSet<Coin> coins);

    void printSortByNominalToFrom(TreeSet<Coin> coins);

    void printSortByMetall(TreeSet<Coin> coins);
}
