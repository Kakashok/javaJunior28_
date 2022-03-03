package lesson6;

public class Main {
    public static void main(String[] args) {
        // формула создания объекта
        int a = 5;
        Animal dog = new Animal();
        dog.setAge(12);

        Animal cat = new Animal();
        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
    }
}
