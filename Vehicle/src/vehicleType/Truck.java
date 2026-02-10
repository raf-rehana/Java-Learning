package vehicleType;

import vehicle.Vehicle;

public class Truck extends Vehicle {

    protected double maxLoad;

    public Truck(double rentPrice, double maxLoad) {
        super(rentPrice);
        this.maxLoad = maxLoad;
    }

    @Override
    public double getSalePrice(double weight) {

        if (weight > maxLoad) {
            System.out.println("Weight exceeds truck capacity!");
            return rentPrice;
        }

        double discount = 0;
        if (weight >= maxLoad * 0.8) discount = 0.20;
        else if (weight >= maxLoad * 0.5) discount = 0.10;

        return rentPrice - (rentPrice * discount);
    }

    public double getMaxLoad() { return maxLoad; }
}
