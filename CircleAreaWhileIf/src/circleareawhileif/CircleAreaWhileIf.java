package circleareawhileif;

import java.util.Scanner;

public class CircleAreaWhileIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double circleArea = 0;
        boolean status = false;
        int count = 1;
        
        while (status == false && count <= 3) {
            System.out.print("Enter Your Radius(Zero Or Negetive Number is Not Acceptable): ");
            float radius = scan.nextFloat();
            if (radius <= 0) {
                status = false;
                count++;
            } else {
                circleArea = Math.PI * Math.pow(radius, 2);
                break;
            }
        }
        if (circleArea > 0) {
            System.out.println("Your Result is: " + circleArea);
        } else {
            System.out.println("Your Have Entered Wrong Number 3 Times. Try Again!");
        }

    }

}
