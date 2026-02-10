package Main;

import vehicleType.Truck;
import vehicleType.SmallTruck;
import vehicleType.MediumTruck;
import vehicleType.HeavyTruck;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new SmallTruck());
        trucks.add(new MediumTruck());
        trucks.add(new HeavyTruck());


        System.out.println("Available Trucks:");
        for (int i = 0; i < trucks.size(); i++) {
            Truck t = trucks.get(i);
            System.out.println(
                (i + 1) + ". " +
                t.getClass().getSimpleName() +
                " | Max Load: " + t.getMaxLoad() + " kg" +
                " | Rent Price: " + t.getRentPrice()
            );
        }


        System.out.print("\nSelect a truck (1-" + trucks.size() + "): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > trucks.size()) {
            System.out.println(" Invalid selection.");
            sc.close();
            return;
        }

        Truck selectedTruck = trucks.get(choice - 1);

        System.out.print("Enter weight of belongings (kg): ");
        double weight = sc.nextDouble();


        System.out.println("\nSelected Truck: " + selectedTruck.getClass().getSimpleName());
        System.out.println("Base Rent Price: " + selectedTruck.getRentPrice());
        System.out.println("Final Rent Price: " + selectedTruck.getSalePrice(weight));

        sc.close();
    }
}
