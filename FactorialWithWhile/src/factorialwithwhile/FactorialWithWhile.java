package factorialwithwhile;

import java.util.Scanner;

public class FactorialWithWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        long number = scanner.nextLong();
        long factorial = 1;
        long i=1;
        
        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println((number + "! = ") + factorial);
    }

}
