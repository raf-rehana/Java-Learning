package atm.util;

import java.util.Scanner;

public class InputUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int val = scanner.nextInt();
        scanner.nextLine();  // consume newline
        return val;
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            scanner.next();
        }
        double val = scanner.nextDouble();
        scanner.nextLine();  // consume newline
        return val;
    }
}
