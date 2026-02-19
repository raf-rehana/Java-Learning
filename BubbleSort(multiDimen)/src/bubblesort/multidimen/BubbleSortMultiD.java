
package bubblesort.multidimen;

public class BubbleSortMultiD {

    public static void main(String[] args) {

        int[][] arr = {
            {5, 2, 9},
            {1, 7, 3},
            {8, 6, 4}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int pass = 0; pass < rows * cols; pass++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols - 1; j++) {


                    if (arr[i][j] > arr[i][j + 1]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                    }
                }


                if (i < rows - 1 && arr[i][cols - 1] > arr[i + 1][0]) {
                    int temp = arr[i][cols - 1];
                    arr[i][cols - 1] = arr[i + 1][0];
                    arr[i + 1][0] = temp;
                }
            }
        }


        System.out.println("Sorted 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}