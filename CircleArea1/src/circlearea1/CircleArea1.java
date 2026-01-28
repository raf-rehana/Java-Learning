package circlearea1;

import java.util.Scanner;

public class CircleArea1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        float radius = input.nextFloat();
        float area;
        float perimeter;

        if (radius > 0) {
            area = (float) (Math.PI * Math.pow(radius, 2));
            perimeter = (float) (2 * Math.PI * radius);

            System.out.println("Area Is: " + Math.round(area));
            System.out.println("Perimeter Is: " + Math.round(perimeter));

        } else {
            System.out.println("Radius Can't be Zero Or Negative");
        }

    }

}
