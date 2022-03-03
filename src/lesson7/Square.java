package lesson7;

public class Square extends Figure {

    protected double a;

    public Square() {
         name = "Square";
    }

    public Square(double a) {
        this.a = a;
        name = "Square";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getP() {
        return a * 4;
    }

    @Override
    public double getS() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "square=" + getS() +
                ", perimeter=" + getP() +
                ", a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(a);
        return (int) (temp ^ (temp >>> 32));
    }
}
