
package gamequit;

import java.util.Scanner;

public class GameQuit {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        boolean yasin = true;

        while (yasin) {

            System.out.print("You are Playing a game! ");
            System.out.print("Enter Q to quit:");
            String quitGame = scanner.next().toUpperCase();

            if (quitGame.equals("Q")) {

                System.out.println("You Have Quit The Game!");

                break;
            }

        }
    }
    
}
