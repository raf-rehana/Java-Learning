package arraymaxmin;

import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int number = scanner.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter " + numberPosition(i + 1) + "Number: ");
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

       float average = sum / array.length;

        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public static String numberPosition(int number) {
        if (number % 10 == 1 && number % 100 != 11) {
            return number + "st";
        } else if (number % 10 == 2 && number % 100 != 12) {
            return number + "nd";
        } else if (number % 10 == 3 && number % 100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }

    }
}
