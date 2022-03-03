package lesson9;

public class Krug {
    protected int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krug krug = (Krug) o;

        return radius == krug.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "radius=" + radius +
                '}';
    }
}
