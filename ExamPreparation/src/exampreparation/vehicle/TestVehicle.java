
package exampreparation.vehicle;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\tWeight is: ");
        int weight = scanner.nextInt();
        
        Truck truck = new Truck(weight, 5000);
        
        double salePrice = truck.getSalePrice();
        
        if(salePrice < truck.regularPrice){
            System.out.println("\tRegular Price: " + truck.regularPrice);
            System.out.println("\n\tFinal Price: " + salePrice + " (Discount Appiled!) \n\n");
        }else{
                 System.out.println("\tRegular Price: " + truck.regularPrice);
            System.out.println("\n\tFinal Price: " + salePrice + " (Discount Not Applicable!) \n\n");
        }
    }
}
