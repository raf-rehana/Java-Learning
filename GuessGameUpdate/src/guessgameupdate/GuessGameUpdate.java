package guessgameupdate;

import java.util.Scanner;

public class GuessGameUpdate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Choose Your Level (Easy/Medium/Hard):");
        String level = scan.next().toLowerCase();

        switch (level) {
            case "easy" -> {
                level(scan, 1, 6);
            }
            case "medium" -> {
                level(scan, 7, 20);
            }
            case "hard" -> {
                level(scan, 20, 50);
            }
        }
    }

    static void level(Scanner scanner, int min, int max) {
        int attepmt = 1;

        while (attepmt <= 3) {
            switch (4 - attepmt) {
                case 0 ->
                    System.out.println("You Have 0 attemps lefts");
                case 1 ->
                    System.out.println("You Have 1 attemps lefts");
                case 2 ->
                    System.out.println("You Have 2 attemps lefts");
            }

            System.out.print("Guess A number(" + min + "-" + max + "): ");
            int guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber(min, max)) {
                System.out.println("WOW! You Have won The Game!");
                break;
            } else {
                System.out.println("OPPS! Try Again.");
                attepmt++;
            }
        }

        System.out.println("Game Over!");
    }

    static int randomNumber(int min, int max) {
        return (int) (Math.random() * (min - max + 1) + min);
    }
}
