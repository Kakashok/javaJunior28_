package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int value) {

        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));

        } else {
            products.put(product, value);
        }
    }

    public void printProducts() {
        // 1й variant
        // for each by Keys (яблоко груша и тд)/ / keySet множество ключей
//        for (String product:products.keySet()) {
//            System.out.println(product + " - " + products.get(product));
//        }

        //2й вариант
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет! - " + product);
            return;
        }
        if (products.get(product) < value) {
            System.out.println("Не хватило " + (value - products.get(product)) + " кг " + product);
            products.remove(product);
            return;
        }
        if (products.get(product) == value) {
            System.out.println("Мы взяли последнее" + product);
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - value);
    }

    public void printCanCook(Recept recept) {
        // products - hashMap в котором лежат все продукты
        // recept.getIngridients() - hashMap с ингридиентами
        for (String ingr : recept.getIngridients().keySet()) {
            if (!products.containsKey(ingr)) {
                System.out.println("Такого продукта нет! - " + ingr);
                return;
            }
            if (products.get(ingr) < recept.getIngridients().get(ingr)) {
                System.out.println("Не хватает " + (recept.getIngridients().get(ingr) - products.get(ingr)) + " кг " + ingr);
                return;
            }

        }
        System.out.println("Можем приготовить " + recept.getName());
    }
}
