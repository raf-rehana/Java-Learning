package arraycalculator;

import java.util.Scanner;

public class ArrayCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of the vector: ");
        int n = scanner.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Enter Element for vector 1: ");
        for (int i = 0; i < n; i++) {
            vector1[i] = scanner.nextInt();
        }
        System.out.println("Enter Element for vector 2: ");
        for (int i = 0; i < n; i++) {
            vector2[i] = scanner.nextInt();
        }
        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Vector Addition");
            System.out.println("2. Vector Subtraction");
            System.out.println("3. Dot Product");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Vector Addition");
                    for (int i = 0; i < n; i++) {
                        System.out.print((vector1[i] + vector2[i]) + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Vector Subtraction");
                    for (int i = 0; i < n; i++) {
                        System.out.print((vector1[i] - vector2[i]) + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int dotProduct = 0;
                    for (int i = 0; i < n; i++) {
                        dotProduct += vector1[i] * vector2[i];
                    }
                    System.out.println("\nDot Product: " + dotProduct);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

    }

}
