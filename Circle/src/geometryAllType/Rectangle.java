
package geometryAllType;

public class Rectangle {
    
   public double length;
   public double width;
    
    public double getArea(){
        double area = length * width;
        return area;
    }
    
     public double getPerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    
    
}
