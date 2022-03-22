package lesson12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>(); // хранение данных по хэшированию (хэш-таблица)
        a.add(1); // вызывается метод hashCode(); - отдает номер строки таблицы
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(a);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(7);

        CollectionUtilImpl util = new CollectionUtilImpl();
        System.out.println(util.union(a, b));

        System.out.println(util.intersection(a, b));

        System.out.println(util.unionWithoutDuplicate(a, b));

        System.out.println(util.intersectionWithoutDuplicate(a, b));

        System.out.println(util.difference(a, b));
    }
}
