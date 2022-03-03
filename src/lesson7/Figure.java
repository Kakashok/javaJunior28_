package lesson7;

public class Figure {

       protected String name;

    public Figure() {
        name = "Figure";
    }

    public double getS() {
        return 0;
    }

    public double getP() {
        return 0;
    }

    void printP() {
        System.out.println(name + " perimeter is: " + getP());
    }

    void  printS() {
        System.out.println(name + " square is: " + getS());
    }

    @Override
    public String toString() {
        return "Figure{" +
                "s=" + getS() +
                ", p=" + getP() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        return name != null ? name.equals(figure.name) : figure.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
