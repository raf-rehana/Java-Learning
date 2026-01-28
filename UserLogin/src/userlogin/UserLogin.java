
package userlogin;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter userName: ");
        String userName = scanner.nextLine();
        
          System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        if(userName.equalsIgnoreCase("rafiaah") && password.equals("Rafiaah1122")){
            System.out.println("Welcome " + userName.toUpperCase()+ "!" );
        }else{
            System.out.println("Invalid login credentials");
        }
        
               
    }
    
}
