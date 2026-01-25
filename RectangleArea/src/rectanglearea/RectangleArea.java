
package rectanglearea;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        float length = input.nextFloat();
        
        System.out.print("Enter Width: ");
        float width = input.nextFloat();
        
        float area = length * width; 
        float perimeter = 2 * (length + width);
        
        System.out.println("Area of the Rectangle Is: " + area);
        System.out.println("Perimeter of the Rectangle Is: " + perimeter);
               
  
    }
    
}
