package exampreparation.exceptions;

import java.util.Scanner;

public class ExceptionHandelling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50,0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter index to access array: ");
        try {
            int index = scanner.nextInt();
            int value = numbers[index]; 
            int result = 100 / value;
            System.out.println("100 / " + value + " = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}