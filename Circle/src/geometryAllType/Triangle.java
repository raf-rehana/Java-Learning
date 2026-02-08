package geometryAllType;

public class Triangle {

    public double a;
    public double b;
    public double c;
    public double height;

    public double getArea() {

        double area = 1 / 2 * b * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

}
