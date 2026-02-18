package exampreparation;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 40, 70, 4, -2, -80, 38, 140, 320, 65, 136};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("\nNew Array: " + Arrays.toString(numberSort(numbers)));
    }

    public static int[] numberSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - j; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
