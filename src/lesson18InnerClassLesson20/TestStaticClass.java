package lesson18InnerClassLesson20;

public class TestStaticClass {
    public static void main(String[] args) {
      //  Car.Engine engine = new Car.Engine(200);
        Car car = new Car("Green", "Lada",200);
        System.out.println(car);

        Car.Engine car1 = car.new Engine(400);
        System.out.println(car1);


    }
}

class Car{
    private static String color;
    String marka;
    Engine engine;

    public Car(String color, String marka, int horsePower) {
        // Engine engine
        this.color = color;
        this.marka = marka;
        //this.engine = engine;
        this.engine = this.new Engine(horsePower);
    }

    static void print(){
        System.out.println("I am a static method");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", marka='" + marka + '\'' +
                ", engine=" + engine +
                '}';
    }

     class Engine {
        // в static class только static переменные из вне
        // final class нельзя расширить. final class можно extend, но от него нельзя. например String
         // второй пример не static class


        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            //System.out.println(color);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class abc{

}
