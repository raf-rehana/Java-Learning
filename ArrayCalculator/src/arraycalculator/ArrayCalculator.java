package arraycalculator;

import java.util.Scanner;

public class ArrayCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your row limit: ");
        int rowSize = scanner.nextInt();

        System.out.print("Enter your column limit: ");
        int columnSize = scanner.nextInt();

        int[][] matrix1 = new int[rowSize][columnSize];
        int[][] matrix2 = new int[rowSize][columnSize];

        inputMatrix(matrix1, scanner, "matrix1");
        inputMatrix(matrix2, scanner, "matrix2");

        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        System.out.println("\n--- MENU ---");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Subtraction");
        System.out.println("3. Matrix Multiplication");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result of Addition:");
                for (int i = 0; i < rowSize; i++) {
                    for (int j = 0; j < columnSize; j++) {
                        System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Result of Subtraction:");
                for (int i = 0; i < rowSize; i++) {
                    for (int j = 0; j < columnSize; j++) {
                        System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                if (matrix1[0].length != matrix2.length) {
                    System.out.println("Cannot multiply: Columns of Matrix 1 != Rows of Matrix 2");
                    break;
                }

                System.out.println("Result of Multiplication:");

                int[][] product = new int[matrix1.length][matrix2[0].length];

                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix2[0].length; j++) {
                        product[i][j] = 0;
                        for (int k = 0; k < matrix1[0].length; k++) {
                            product[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                        System.out.print(product[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 4:
                System.out.println("Exiting program!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void inputMatrix(int[][] matrix, Scanner scanner, String name) {
        System.out.println("Enter elements for " + name + ":");

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print("Row " + (row + 1) + " x Column " + (col + 1) + ": ");
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

}
