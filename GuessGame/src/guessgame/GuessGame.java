package guessgame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Random numbers for each level
        int randomEasy = randomNumber(1, 6);
        int randomMedium = randomNumber(10, 20);
        int randomHard = randomNumber(21, 40);

        int guess; // single guess variable for all levels

        // Loop for 3 attempts
        for (int i = 1; i <= 3; i++) {       
            System.out.print("Choice Level (Easy/Medium/Hard): ");
            String level = scanner.nextLine().toLowerCase();

            System.out.println("Attempt " + i);
            System.out.print("Guess a Number: ");
            guess = scanner.nextInt(); 
            scanner.nextLine(); // consume leftover Enter key

            if (level.equals("easy")) {
                if (guess == randomEasy) {
                    System.out.println("Congratulations! You Gussed The Correct Number");
                    break; // stop loop if guessed correctly
                } else {
                    System.out.println("Better Luck Next Time!");
                }

            } else if (level.equals("medium")) {
                if (guess == randomMedium) {
                    System.out.println("Congratulations! You Gussed The Correct Number");
                    break;
                } else {
                    System.out.println("Better Luck Next Time!");
                }

            } else if (level.equals("hard")) {
                if (guess == randomHard) {
                    System.out.println("Congratulations! You Gussed The Correct Number");
                    break;
                } else {
                    System.out.println("Better Luck Next Time!");
                }

            } else {
                System.out.println("Invalid Choice");
            }
        }

        scanner.close();
    }

    // Method to generate random number between min and max (inclusive)
    static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
