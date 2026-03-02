
package exampreparation.vehicle;

public class Truck extends Vehicle {
    public int weight;


    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
     if(weight> 2000){
         return regularPrice - (regularPrice * 0.10);
     }else{
         return regularPrice;
     }
    }
    
    
}
