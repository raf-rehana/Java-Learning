package guessgame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int randomEasy = randomNumber(1, 6);
//        int randomMedium = randomNumber(10, 20);
//        int randomHard = randomNumber(21, 40);

        System.out.print("Choice Level (Easy/Medium/Hard): ");
        String level = scanner.nextLine().toLowerCase();

        switch (level) {
            case "easy" : 
                guessNumber( scanner,1, 6);
                break;
            
            case "medium" : 
                guessNumber( scanner, 1, 10);
                break;
            
            case "hard" :
                guessNumber(scanner, 20, 50);
                break;
            

            default :
                System.out.println("Invalid Choice");
                break;
            

        }
    }

    static void guessNumber(Scanner scanner, int min, int max) {
        System.out.print("Guess a Number: ");
        int guessNumber = scanner.nextInt();
        
        int random = randomNumber(min, max);

        if (random == guessNumber) {
            System.out.println("Congratulations! You Gussed The Correct Number");

        } else {
            System.out.println("Better Luck Next Time!");
        }
    }

    static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
