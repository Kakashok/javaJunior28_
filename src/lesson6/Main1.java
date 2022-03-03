package lesson6;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12,15,17);
        Triangle triangle1 = new Triangle();

        int perimeter = triangle.perimeter();
        System.out.println(perimeter);

        PryamoygTriangle triangle2 = new PryamoygTriangle();

        Krug krug1 = new Krug();
        Krug krug2 = new Krug();

        Object[] objects = new  Object[5];
        objects[0] = triangle;
        Triangle a = (Triangle) objects[0];


        // дальше сетами задаются параметры если поменялись
//        triangle.setA(12);
//        triangle.setB(15);
//        triangle.setC(17);


    }
}
