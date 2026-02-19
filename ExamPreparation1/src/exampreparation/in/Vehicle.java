package exampreparation.in;

public class Vehicle {

    int speed;
    double regularPrice;
    String color;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;

    }

    public double getSalePrice() {
        return regularPrice;
    }
}
