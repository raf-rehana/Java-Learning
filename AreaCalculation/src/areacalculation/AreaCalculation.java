
package areacalculation;

import java.util.Scanner;


public class AreaCalculation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("radius: ");
        double radius = scan.nextDouble();
 
        
        double area = Math.PI * Math.pow(radius,2);
        
        System.out.print("Area Is: " + area);
    }
    
}
