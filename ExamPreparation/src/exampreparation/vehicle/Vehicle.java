
package exampreparation.vehicle;

public class Vehicle {
    public int speed;
    public String color;
    public double regularPrice;

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    
    
    
    public double getSalePrice(){
        return regularPrice;
    }
    
    
    
    
    
}
