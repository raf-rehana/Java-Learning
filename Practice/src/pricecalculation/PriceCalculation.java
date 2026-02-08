package pricecalculation;

import Price.GroceryPrice;
import java.util.Scanner;

public class PriceCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GroceryPrice groceryPrice = new GroceryPrice();
        
        System.out.print("\nTotal Unit Number: ");
        groceryPrice.unit = scanner.nextInt();
        
        System.out.print("Per Unit Price: ");
        groceryPrice.unitprice = scanner.nextDouble();
        
        System.out.println("\nTotal Price is: " + groceryPrice.getTotalPrice());
        
        System.out.println("Discount Amount is: " + groceryPrice.getDiscount());
        System.out.println("---------------------------------------------------");
        System.out.println("Final Price is: " + groceryPrice.getFinalPrice());
        
        
    }
}
