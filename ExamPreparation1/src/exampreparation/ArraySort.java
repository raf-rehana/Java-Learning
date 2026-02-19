package exampreparation;

public class ArraySort {

    public static void main(String[] args) {
        int[][] array = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };
        System.out.println("\nOriginal 2D Array:");
        arrayPrint(array);

        for (int i = 0; i < array.length; i++) {
            arraySort(array[i]);
        }

        System.out.println("\nSorted 2D Array:");
        arrayPrint(array);
    }

    public static void arraySort(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < row.length - 1 - i; j++) {
                if (row[j] > row[j + 1]) {
                    int temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                }
            }
        }
    }

    public static void arrayPrint(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%-5d", value);
            }
            System.out.println();
        }
    }
}
