package vowelconsonant;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length : ");
        double length = scan.nextDouble();
        
        System.out.print("Enter width: ");
        double width = scan.nextDouble();
        
        double area = length * width;
        
        double perimeter = 2 *(length + width);
        
        System.out.println( "Area is: " + area );
          System.out.println( "perimeter is: " + perimeter );
        

       
    //for string u cannt use '==', must use equals

}

}
