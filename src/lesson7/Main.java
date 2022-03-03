package lesson7;

public class Main {
    public static void main(String[] args) {
//        Otlichnik otlichnik1 = new Otlichnik(23, "Вася");
//        Otlichnik otlichnik2 = new Otlichnik(23, "Вася");
//
//        Student student1 = new Student(24, "Кирилл");
//        Student student2 = new Student(24, "Кирилл");
//
//        System.out.println(student1.equals(student2));
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//
//        Student[] students = new Student[4];
//        students[0] = student1;
//        students[1] = student2;
//        students[2] = otlichnik1;
//        students[3] = otlichnik2;
//
//
//        System.out.println(student1);


        // for each

//        for (Student s : students) {
//            System.out.println(s.perimetreTreug(2, 2, 20));  // полиморфизм
//            // полиморфизм - свойство жавы работать с разными типами данных как с одним и тем же типом с разной реализацией
//
//        }
        // перегруженные методы - метод с одним названием, но с разными функциям


        Quadrilateral quadrilateral = new Quadrilateral(10, 15, 16, 12, 60, 120);

        quadrilateral.printP();
        quadrilateral.printS();
        System.out.println(quadrilateral);

        Square square = new Square(6);
        square.printP();
        square.printS();
        System.out.println(square);

        Rectangle rectangle = new Rectangle(5, 16);
        rectangle.printP();
        rectangle.printS();
        System.out.println(rectangle);

        Trapezoid trapezoid = new Trapezoid(6, 7, 5, 5, 6);
        trapezoid.printP();
        trapezoid.printS();
        System.out.println(trapezoid);

        Ellipse ellipse = new Ellipse(4, 5);
        ellipse.printP();
        ellipse.printS();
        System.out.println(ellipse);

        Circle circle = new Circle(5);
        circle.printP();
        circle.printS();
        System.out.println(circle);

        Triangle triangle = new Triangle(10, 8, 5);
        triangle.printP();
        triangle.printS();
        System.out.println(triangle);
    }

}
