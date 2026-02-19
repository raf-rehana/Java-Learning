package exampreparation;

import java.util.Arrays;
import java.util.Scanner;

public class LowestHighestNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + numberPosition(i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nNumbers Entered: " + Arrays.toString(numbers));
        
        int lowest = numbers[0];
        int highest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println("\nLowest number: " + lowest);
        System.out.println("Highest number: " + highest);
        scanner.close();

    }

    private static String numberPosition(int number) {
        switch (number) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
