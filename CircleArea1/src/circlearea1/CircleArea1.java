
package circlearea1;

import java.util.Scanner;

public class CircleArea1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Radius: ");
        float radius = input.nextFloat();
        
        double area = Math.PI * Math.pow(radius, 2);       
        double perimeter = 2 * Math.PI * radius;
 
        
        System.out.println("Area Is: " + area);
        System.out.println("Perimeter Is: " + perimeter);
    }
    
}
