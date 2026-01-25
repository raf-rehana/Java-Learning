
package rectangle1;

import java.util.Scanner;




public class Rectangle1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        
        System.out.print("Enter Width: ");
        double width = input.nextDouble();
        
        double area = length * width;
        
        double perimeter = 2 * (length + width);
        
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
    
}
