package lesson13;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class SortCoins implements ISortCoins {

    @Override
    public void printSortByDiameterFromTo(TreeSet<Coin> coins) {
        TreeSet<Coin> bySort = new TreeSet<>(new SortByDiameterFromToComparator());
        bySort.addAll(coins);
        for (Coin coin : bySort) {
            System.out.println(coin);
        }
    }

    @Override
    public void printSortByDiameterToFrom(TreeSet<Coin> coins) {
        TreeSet<Coin> bySort = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o2.getDiameter(), o1.getDiameter());
                }

                if (o1.getYear() != o2.getYear()) {
                    return o2.getYear() - o1.getYear();
                }

                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();

                }

                if (!o1.getMetal().equals(o2.getMetal())) {
                    return o2.getMetal().compareTo(o1.getMetal());

                }
                return 0;
            }
        });
        bySort.addAll(coins);
        for (Coin coin : bySort) {
            System.out.println(coin);
        }

    }

    @Override
    public void printSortByNominalFromTo(TreeSet<Coin> coins) {
        TreeSet<Coin> bySort = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();

                }

                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }

                if (!o1.getMetal().equals(o2.getMetal())) {
                    return o1.getMetal().compareTo(o2.getMetal());

                }

                return 0;
            }
        });
        bySort.addAll(coins);
        for (Coin coin : bySort) {
            System.out.println(coin);
        }

    }

    @Override
    public void printSortByNominalToFrom(TreeSet<Coin> coins) {
        TreeSet<Coin> bySort = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();

                }

                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o2.getDiameter(), o1.getDiameter());
                }

                if (o1.getYear() != o2.getYear()) {
                    return o2.getYear() - o1.getYear();
                }

                if (!o1.getMetal().equals(o2.getMetal())) {
                    return o2.getMetal().compareTo(o1.getMetal());

                }
                return 0;
            }
        });
        bySort.addAll(coins);
        for (Coin coin : bySort) {
            System.out.println(coin);
        }

    }

    @Override
    public void printSortByMetall(TreeSet<Coin> coins) {
        TreeSet<Coin> bySort = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if (!o1.getMetal().equals(o2.getMetal())) {
                    return o1.getMetal().compareTo(o2.getMetal());
                }

                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();

                }

                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }


                return 0;
            }
        });

        bySort.addAll(coins);
        for (Coin coin : bySort) {
            System.out.println(coin);
        }

    }
}
