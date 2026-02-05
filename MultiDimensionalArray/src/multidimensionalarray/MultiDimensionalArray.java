package multidimensionalarray;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[][] myArray = new int[5][5];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;
        myArray[0][4] = 5;

        myArray[1][0] = 6;
        myArray[1][1] = 7;
        myArray[1][2] = 8;
        myArray[1][3] = 9;
        myArray[1][4] = 9;

        myArray[2][0] = 1;
        myArray[2][1] = 2;
        myArray[2][2] = 3;
        myArray[2][3] = 4;
        myArray[2][4] = 5;

        myArray[3][0] = 5;
        myArray[3][1] = 6;
        myArray[3][2] = 7;
        myArray[3][3] = 8;
        myArray[3][4] = 9;

        for (int[] row : myArray) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        //next one from user Input

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
