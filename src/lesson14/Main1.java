package lesson14;

public class Main1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Яблоко", 2);
        fridge.addProduct("Слива", 4);
        fridge.addProduct("Груша", 1);
        fridge.addProduct("Черника", 4);
        fridge.addProduct("Яблоко", 5);
        fridge.addProduct("Тесто", 5);

        //fridge.getProduct("Яблоко", 7);

        fridge.printProducts();

        Recept recept = new Recept("Весенний пирог");
        recept.addIngridient("Яблоко", 1);
        recept.addIngridient("Черника", 1);
        recept.addIngridient("Тесто", 2);

        fridge.printCanCook(recept);




    }
}
