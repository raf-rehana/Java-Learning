
package firstclass;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = scan.nextDouble();
        
        System.out.print("Enter width: ");
        double width = scan.nextDouble();
        
        double area = length * width;
        
        System.out.print("Area Is: " + area);
}
}
