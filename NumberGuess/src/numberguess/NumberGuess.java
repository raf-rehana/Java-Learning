package numberguess;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomEasy = randomInRange(1, 6);
        int randomMedium = randomInRange(1, 10);
        int randomHard = randomInRange(10, 30);

        System.out.println("Choose a level(Easy/Medium/Hard): ");
        String level = scanner.next();

        switch (level) {
            case ("Easy"):
                levelChoice(scanner,randomEasy);
                break;

            case ("Medium"):
                levelChoice(scanner,randomMedium);
                break;

            case ("Hard"):
                 levelChoice(scanner,randomHard);
                break;
            default:
                System.out.println("Invalid Choice");

        }

    }

    static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    static void levelChoice(Scanner scanner, int randomNumber) {
        System.out.print("Guess a Number: ");
        int numberEasy = scanner.nextInt();

        if (randomNumber == numberEasy) {
            System.out.println("Wow! you guessed the Correct Number");
        } else {
            System.out.println("Try again");
        }
    }

}
