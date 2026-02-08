package geometryAllType;

public class Trapezium {

    public double a;
    public double b;
    public double height;

    public double getArea() {
        double area = 1 / 2 * (a + b) * height;
        return area;
    }
}
