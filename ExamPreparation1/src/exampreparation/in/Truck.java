package exampreparation.in;

public class Truck extends Vehicle {

    double weight;

    public Truck(double weight) {
        this.weight = weight;
    }

    public Truck(double weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

   

    @Override
    public double getSalePrice() {
      if(weight>2000){
         return regularPrice - (regularPrice * 0.1);
      }else{
        
          return  regularPrice;
      }
    }
    
}
