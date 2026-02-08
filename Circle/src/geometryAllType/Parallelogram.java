
package geometryAllType;

public class Parallelogram {

    public double base;
    public double height;
    
    public double getArea(){
        double area = base * height;
        return area;        
    }
    public double getPerimeter(){
        double perimeter = 2 * (base + height);
        return perimeter;        
    }
    
  
}
