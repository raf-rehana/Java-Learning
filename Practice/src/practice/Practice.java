package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Select Operator(+, -, *, /: ");
        String operator = scanner.next();

        System.out.print("Enter Second Number: ");
        double number2 = scanner.nextDouble();

        double result = 0;
        boolean error = true;

        if (operator.equals("+")) {
            result = number1 + number2;

        } else if (operator.equals(" - ")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.err.println("Number Can't Divide By Zero!");
            }

        } else {
            System.err.println("Invalid Operator");
            error = true;
        }

        if (error != true) {
            System.out.println("Result Is: " + result);
        }

    }

}
