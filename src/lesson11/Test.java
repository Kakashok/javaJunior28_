package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            arrayList.add("qwerty" + i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            linkedList.add("qwerty" + i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            arrayList.get(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("ArrayList get: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            linkedList.get(i);
        }
        long end4 = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (end4 - start4));
    }
}
