package geometry.java;

public class Triangle {

    public double getArea(double b, double height) {
        double area = 1 / 2 * b * height;
        return area;
    }

    public double getPerimeter(double a, double b, double c) {
        double perimeter = a + b + c;
        return perimeter;
    }

}
