package lesson10;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Animal[] animals = new Animal[4];
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = dog1;
        animals[3] = dog2;

        // for each
        for(Animal animal:animals){
            animal.voice();
        }

    }
}
