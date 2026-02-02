package arrnumberanalyzer;

import java.util.Scanner;

public class ArrNumberAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = array[0];
        int min = array[0];
        int even = 0;
        int odd = 0;
        for (int number : array) {
            sum += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        double avg = (double) sum / n;

        System.out.println("\n--- Analysis Result ---");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Largest Number: " + max);
        System.out.println("Smallest Number: " + min);
        System.out.println("Even Numbers Count: " + even);
        System.out.println("Odd Numbers Count: " + odd);

        System.out.print("\nEnter number to search: ");
        int key = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                System.out.println("Number found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found!");
        }

    }
}
