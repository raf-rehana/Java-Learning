package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Row Size for M1: ");
        int rowSize1 = scanner.nextInt();

        System.out.print("Enter Column Size  for M1: ");
        int colSize1 = scanner.nextInt();

        System.out.print("Enter Row Size  for M2: ");
        int rowSize2 = scanner.nextInt();

        System.out.print("Enter Column Size  for M2: ");
        int colSize2 = scanner.nextInt();

        int[][] matrix1 = new int[rowSize1][colSize1];
        int[][] matrix2 = new int[rowSize2][colSize2];

        inputMatrix(matrix1, scanner, "matrix1");
        inputMatrix(matrix2, scanner, "matrix2");

        System.out.println("\nMatrix 1: ");
        printMatrix(matrix1);

        System.out.println("Matrix 2: ");
        printMatrix(matrix2);

    }

    static void inputMatrix(int[][] matrix, Scanner scanner, String name) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Row " + (row + 1) + " x Column " + (col + 1) + ": ");
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
