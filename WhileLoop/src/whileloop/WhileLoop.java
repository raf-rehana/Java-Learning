
package whileloop;

import java.util.Scanner;


public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response= "";
        
        while(!response.equals("Q")){
            System.out.println("You Are Playing a game!");
            System.out.print("Enter Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        
        System.out.println("You Have Quit the game!");
    }
    
}
