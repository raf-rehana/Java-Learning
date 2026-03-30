package exampreparation.exceptions;

import java.util.Scanner;

public class ExceptionHandel {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("\nEnter numerator: ");
                    if (scanner.hasNext("q")) {
                        System.out.println("Exiting...");
                        break;
                    }
                    int numerator = scanner.nextInt();
                    System.out.print("Enter denominator: ");
                    if (scanner.hasNext("q")) {
                        System.out.println("Exiting...");
                        break;
                    }
                    int denominator = scanner.nextInt();

                    int result = numerator / denominator;
                    System.out.println("Result: " + numerator + " / " + denominator + " = " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Error: Cannot divide by zero!");
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("\nInvalid input! Please enter integers only.");
                    scanner.nextLine();
                }
            }
        }
    }
}
