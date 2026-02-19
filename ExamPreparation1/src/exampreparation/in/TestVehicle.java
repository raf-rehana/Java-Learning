package exampreparation.in;

import java.util.Scanner;

public class TestVehicle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();

        Truck truck = new Truck(weight, 5000);

        System.out.println("Regular Price: " + truck.regularPrice + " Taka");

        double salePrice = truck.getSalePrice();

        if (salePrice < truck.regularPrice) {
            System.out.println("\nDiscount Applied! \nFinal Price: " + salePrice + " Taka");
        } else {
            System.out.println("\nNo discount applied. \nFinal Price: " + salePrice + " Taka");
        }
    }
}
