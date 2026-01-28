package guessgame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomEasy = randomNumber(1, 6);
        int randomMedium = randomNumber(10, 20);
        int randomHard = randomNumber(21, 40);

        System.out.print("Choice Level (Easy/Medium/Hard): ");
        String level = scanner.nextLine().toLowerCase();

        if (level.equals("easy")) {
            guessNumber(randomEasy, scanner);

        } else if (level.equals("medium")) {
            guessNumber(randomMedium, scanner);

        } else if (level.equals("hard")) {
            guessNumber(randomHard, scanner);

        } else {
            System.out.println("Invalid Choice");
        }

    }

    static void guessNumber(int random, Scanner scanner) {
        System.out.print("Guess a Number: ");
        int guessNumber = scanner.nextInt();
        
        if (random == guessNumber) {
            System.out.println("Congratulations! You Gussed The Correct Number");

        } else {
            System.err.println("Better Luck Next Time!");
        }
    }

    static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
