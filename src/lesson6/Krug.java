package lesson6;

public class Krug {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public  int perimetr(){
        return (int) (2 * Math.PI * radius);

    }
}
