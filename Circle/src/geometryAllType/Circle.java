package geometryAllType;

public class Circle {

    public double radius;

    public double getArea() {
        double area =  Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
