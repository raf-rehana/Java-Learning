package exampreparation.in;

import java.util.Scanner;

public class TestVehicle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Weight(kg): ");
        double weight = scanner.nextDouble();

        Truck truck = new Truck(weight, 5000);

        System.out.println("\nRegular Price: " + truck.regularPrice + " Taka");

        double salePrice = truck.getSalePrice();

        if (salePrice < truck.regularPrice) {
            System.out.println("Final Price: " + salePrice + " Taka (Discount Applied!)");
        } else {
            System.out.println("Final Price: " + salePrice + " Taka (Discount Not Applicable!)");
        }
    }
}
