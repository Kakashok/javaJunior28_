package lesson18InnerClassLesson20;

public class AnonymusClass {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public boolean check() {
                return false;
            }
        };
    }
}
interface A{
    boolean check();
}

class B implements A{

    @Override
    public boolean check() {
        return false;
    }
}