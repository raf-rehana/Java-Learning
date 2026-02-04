package arraycalculator;

import java.util.Scanner;

public class ArrayCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows for Matrix 1: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter columns for Matrix 1: ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter rows for Matrix 2: ");
        int rows2 = scanner.nextInt();

        System.out.print("Enter columns for Matrix 2: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        inputMatrix(matrix1, scanner, "matrix1");
        inputMatrix(matrix2, scanner, "matrix2");

        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Subtraction");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                        System.out.println("Addition not possible! Matrices must be same size.");
                        break;
                    }

                    System.out.println("Result of Addition:");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
                        System.out.println("Subtraction not possible! Matrices must be same size.");
                        break;
                    }

                    System.out.println("Result of Subtraction:");
                    for (int i = 0; i < matrix1.length; i++) {
                        for (int j = 0; j < matrix1[0].length; j++) {
                            System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (cols1 != rows2) {
                        System.out.println("Cannot multiply!");
                        System.out.println("Columns of Matrix 1 must equal rows of Matrix 2.");
                        break;
                    }
                    System.out.println("Result of Multiplication:");

                    int[][] product = new int[rows1][cols2];
                    
                    for (int i = 0; i < rows1; i++) {
                        for (int j = 0; j < cols2; j++) {
                            product[i][j] = 0;
                            for (int k = 0; k < cols1; k++) {
                                product[i][j] += matrix1[i][k] * matrix2[k][j];
                            }
                            System.out.print(product[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
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
