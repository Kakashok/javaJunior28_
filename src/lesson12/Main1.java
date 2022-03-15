package lesson12;

import java.util.HashSet;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(7);

        CollectionUtilImpl util = new CollectionUtilImpl();
        System.out.println(util.union(a, b));
    }
}
