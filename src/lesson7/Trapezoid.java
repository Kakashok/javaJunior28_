package lesson7;

public class Trapezoid extends Square {

    protected double b, c, d, h;

    public Trapezoid() {
        name = "Trapezoid";
    }

    public Trapezoid(double a, double b, double c, double d, double h) {
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        name = "Trapezoid";
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getP() {
        return a + b + c + d;
    }

    @Override
    public double getS() {
        return (a + b) / 2 * h;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "square=" + getS() +
                ", perimeter=" + getP() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", h=" + h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapezoid trapezoid = (Trapezoid) o;

        if (Double.compare(trapezoid.b, b) != 0) return false;
        if (Double.compare(trapezoid.c, c) != 0) return false;
        if (Double.compare(trapezoid.d, d) != 0) return false;
        return Double.compare(trapezoid.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(d);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
