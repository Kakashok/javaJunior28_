package lesson13;

public class Coin implements Comparable<Coin>{
    private int year;
    private int nominal;
    private double diameter;
    private String metal;

    public Coin() {
    }

    public Coin(int year, int nominal, double diameter, String metal) {
        this.year = year;
        this.nominal = nominal;
        this.diameter = diameter;
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (year != coin.year) return false;
        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diameter, diameter) != 0) return false;
        return metal != null ? metal.equals(coin.metal) : coin.metal == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = year;
        result = 31 * result + nominal;
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diameter=" + diameter +
                ", metal='" + metal + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        // this - первая монета
        // o - вторая монета
        // вернуть -число +число или 0

        if (this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }

        if (this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();

        }

        if(this.getDiameter() != o.getDiameter()){
           return Double.compare(this.getDiameter(), o.getDiameter());
        }

        if (!this.getMetal().equals(o.getMetal())){
            return this.getMetal().compareTo(o.getMetal());

        }


        return 0;
    }


}
