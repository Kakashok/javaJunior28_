package lesson15;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-10);
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
        }
    }
}
