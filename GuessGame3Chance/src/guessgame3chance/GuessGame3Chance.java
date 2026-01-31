package guessgame3chance;

import java.util.Scanner;

public class GuessGame3Chance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a level (Easy / Medium / Hard): ");
        String level = scanner.next().toLowerCase();

        switch (level) {

            case "easy" -> playLevel(scanner, 1, 6);
            case "medium" -> playLevel(scanner, 1, 10);
            case "hard" -> playLevel(scanner, 10, 30);
            default -> System.out.println("Invalid Choice");
        }
    }

    static void playLevel(Scanner scanner, int min, int max) {

        int randomNum = randomInRange(min, max);
        int attempts = 1;

        while (attempts <= 3) {

            System.out.print("Attempt " + attempts
                    + "! Guess a number (" + min + " - " + max + "): ");

            int guess = scanner.nextInt();

            if (guess == randomNum) {
                System.out.println("Wow! You guessed the correct number!");
                return;
            } else {
                if(attempts==3){
                     System.out.println("Better Luck Next Time!");
                    
                } else{System.out.println("OPPS! Try Again!");
                   
                }
                
            }

            attempts++;
        }

        System.out.println("Game Over! The correct number was: " + randomNum);
    }

    static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
