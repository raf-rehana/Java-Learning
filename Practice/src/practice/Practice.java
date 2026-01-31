package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int randomN = (int) (Math.random() * 10);
        int attempt = 1;

        while (attempt <= 3) {

            System.out.print("Attempt " + attempt + ": Guess a Number: ");
            int guessN = input.nextInt();

            if (guessN == randomN) {
                System.out.println("WOW! YOU WIN!");
                return;
            } else if (guessN > randomN) {
                System.out.println("Your Guess Number Is Too Large!");
            } else {
                System.out.println("Your Guess Number Is Too Small!");
            }

            System.out.println("Attempts left: " + (3 - attempt));
            attempt++;
        }

        System.out.println("OPPS! System Guessed " + randomN + "!");
    }
}
