package arraymaxmin;

import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int number = scanner.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        numberMethod(numbers);

    }

    public static void numberMethod(int[] array) {
        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int num : array) {
            sum += num;

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum/array.length;
        
        System.out.println("MAximum Number: " + max);
        System.out.println("Minimum Number: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}
