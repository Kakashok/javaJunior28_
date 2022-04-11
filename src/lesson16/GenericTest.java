package lesson16;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {


        List<Number> strings = new ArrayList<>();

        strings.add(4);
        strings.add(6);
        strings.add(4.2);
        strings.add(3);



        for (Object string : strings) {
            String s = (String) string;
            System.out.println(string);

        }

    }

    private static class Java {
    }
}