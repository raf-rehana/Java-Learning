package exampreparation;

import java.util.Scanner;

public class RecursionMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long fact = factorial(number);
        System.out.println(number + "! = " + fact);
        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
