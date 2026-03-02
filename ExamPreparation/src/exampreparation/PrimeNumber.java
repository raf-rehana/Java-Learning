package exampreparation;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("\n" + number + " is a Prime Number!" + "\n");
        } else {
            System.out.println("\n" + number + " is NOT a Prime Number!" + "\n");
        }

    }
}
