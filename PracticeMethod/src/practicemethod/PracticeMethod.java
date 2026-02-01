package practicemethod;

import java.util.Scanner;

public class PracticeMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        long number = scanner.nextLong();

        factorialValue(number);
    }

    static void factorialValue(long number) {

        long factorial = 1;
        long i = 1;

        if (number <= 0) {
            System.out.println("Enter A Positive Number");
        } else {
            while (i <= number) {
                factorial *= i;
                i++;
            }
             System.out.println((number + "! = ") + factorial);
        }
       
    }
}
