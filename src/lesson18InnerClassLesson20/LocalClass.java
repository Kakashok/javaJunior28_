package lesson18InnerClassLesson20;

public class LocalClass {

    void operations(int delimoe, int delitel) {
        int a = 4;
        final class Division {
            void getChastnoe() {
                System.out.println(delimoe / delitel);
            }

            void getOstatok() {
                System.out.println(delimoe % delitel);
            }
        }

        Division division = new Division();
        division.getChastnoe();
        division.getOstatok();
    }
}

class TestLocalClass {
    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();

        //localClass.operations();
    }
}