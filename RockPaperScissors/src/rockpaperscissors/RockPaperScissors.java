package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerchoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter Your Move(rock, paper, scissors): ");
            playerchoice = scanner.nextLine().toLowerCase();
            if (!playerchoice.equals("scissors")
                    && !playerchoice.equals("rock")
                    && !playerchoice.equals("paper")) {

                System.out.println("Invalid Choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            if (playerchoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else {
                switch (playerchoice) {
                    case "rock" ->
                        System.out.println(computerChoice.equals("scissors") ? "You Win!" : "You Lose!");
                    case "paper" ->
                        System.out.println(computerChoice.equals("rock") ? "You Win!" : "You Lose!");
                    case "scissors" ->
                        System.out.println(computerChoice.equals("paper") ? "You Win!" : "You Lose!");
                        
                }
            }
            System.out.print("Play Again(Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks For Playing!");

    }

}
