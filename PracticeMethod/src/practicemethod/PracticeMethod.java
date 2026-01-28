package numberguess;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a level (Easy / Medium / Hard): ");
        String level = scanner.next().toLowerCase();

        switch (level) {

            case "easy" -> playLevel(scanner, 1, 6);

            case "medium" -> playLevel(scanner, 1, 10);

            case "hard" -> playLevel(scanner, 10, 30);

            default -> System.out.println("Invalid Choice");
        }

        scanner.close();
    }

    // 🎮 Function that handles one level with 3 tries
    static void playLevel(Scanner scanner, int min, int max) {

        int randomNum = randomInRange(min, max);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Attempt " + i +
                    " - Guess a number (" + min + "–" + max + "): ");

            int guess = scanner.nextInt();

            if (guess == randomNum) {
                System.out.println("🎉 Wow! You guessed the correct number!");
                return; // stop the function if guessed correctly
            }
        }

        System.out.println("❌ Game Over! The number was: " + randomNum);
    }

    // 🎲 Random number generator
    static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
