package lesson6;

public class Triangle {
    // поля класса
    private int a;
    private int b;
    private int c;

    // конструкторы
    public Triangle() {

    }


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    // методы класса
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimeter(){
        return a + b + c;
    }


}
