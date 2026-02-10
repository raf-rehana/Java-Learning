package vehicle;

public class Vehicle {

    protected double rentPrice;

    public Vehicle(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getSalePrice(double weight) {
        return rentPrice;
    }

    public double getRentPrice() {
        return rentPrice;
    }
}
