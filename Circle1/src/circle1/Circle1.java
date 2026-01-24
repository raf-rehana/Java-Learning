
package circle1;

import java.util.Scanner;


public class Circle1 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        
        System.out.print("Enter radius: ");
        
        double radius = scan.nextDouble();
        
        double perimeter = 2 * Math.PI * radius;
        
        System.out.println("Perimeter is: " + perimeter);
        
        
    }
    
}
