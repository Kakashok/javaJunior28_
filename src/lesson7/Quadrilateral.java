package lesson7;

public class Quadrilateral extends Square {
    protected double b, c, d, alpha, beta;

// alpha - угол между a, b. beta - угол между c, d.

    public Quadrilateral() {
        name = "Quadrilateral";
    }


    public Quadrilateral(double a, double b, double c, double d, double alpha, double beta) {
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.alpha = alpha;
        this.beta = beta;
        name = "Quadrilateral";
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public double getP() {
        return a + b + c + d;
    }

    @Override
    public double getS() {
        double p = (a + b + c + d) / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - c) - a * b * c * d * Math.pow(Math.cos((alpha + beta) / 2), 2));
            }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "square=" + getS() +
                ", perimeter=" + getP() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", alpha=" + alpha +
                ", beta=" + beta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Quadrilateral that = (Quadrilateral) o;

        if (Double.compare(that.b, b) != 0) return false;
        if (Double.compare(that.c, c) != 0) return false;
        if (Double.compare(that.d, d) != 0) return false;
        if (Double.compare(that.alpha, alpha) != 0) return false;
        return Double.compare(that.beta, beta) == 0;
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
        temp = Double.doubleToLongBits(alpha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(beta);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
