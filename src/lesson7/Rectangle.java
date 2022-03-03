package lesson7;

public class Rectangle extends Square {

    protected double b;

    public Rectangle() {
        name = "Rectangle";
    }

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getP() {
        return (a + b) * 2;
    }

    @Override
    public double getS() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + getS() +
                ", perimeter=" + getP() +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        return Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
