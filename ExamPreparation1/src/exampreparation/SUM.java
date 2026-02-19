package exampreparation;

import java.util.Scanner;


public class SUM {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Integer Number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number >= 0) {
            sum += number;
            System.out.print("Enter Integer Number: ");
            number = scanner.nextInt();
        }

        System.out.println("\nSUM of all Numbers : " + sum + "\n\n");
        scanner.close();
    }

}
