package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();
        texts.add("eee");
        texts.add("qqq");
        texts.add("www");
        texts.add(0, "!!!");
        texts.set(0, "@@@");

        System.out.println(texts);
    }
}
