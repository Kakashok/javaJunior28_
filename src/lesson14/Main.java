package lesson14;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> rating = new HashMap<>();
        rating.put("Динамо", 10);
        rating.put("Шахтер", 6);
        rating.put("Арсенал", 8);

        System.out.println(rating);
    }
}
