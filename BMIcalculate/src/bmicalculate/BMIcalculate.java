package bmicalculate;

import java.util.Scanner;

public class BMIcalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your BMI: ");
        float bmi = scanner.nextFloat();

        if (bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi < 25.0) {
            System.out.println("You are Normal");
        } else if (bmi < 30.0) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
