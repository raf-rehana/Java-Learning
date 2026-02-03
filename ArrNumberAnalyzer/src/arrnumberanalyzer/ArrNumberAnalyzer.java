package arrnumberanalyzer;

import java.util.Scanner;

public class ArrNumberAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? : ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + numberPosition(i + 1) + " Number: ");
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

        float avg = sum / n;

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
                System.out.println("Number Found At " + numberPosition(i + 1)+ " position!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number Not found!");
        }

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
