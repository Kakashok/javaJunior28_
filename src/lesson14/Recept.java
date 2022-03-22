package lesson14;

import java.util.HashMap;

public class Recept {
    private String name;
    private HashMap<String,Integer> ingridients = new HashMap<>();

    public Recept(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addIngridient(String ingridient, int value){
        if (ingridients.containsKey(ingridient)) {
            ingridients.put(ingridient, value + ingridients.get(ingridient));

        } else {
            ingridients.put(ingridient, value);
        }
    }


}
