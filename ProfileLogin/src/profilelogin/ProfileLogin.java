package profilelogin;

import java.util.Scanner;

public class ProfileLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter userName: ");
        String userName = scanner.nextLine();

        if (userName.equalsIgnoreCase("rafiaahnur")) {
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (password.equals("Rafiaah1122")) {
                System.out.println("Welcome " + userName.toUpperCase() + "!");
            } else {
                System.out.println("Please Enter Correct Password");
            }

        } else {
            System.out.println("Please Enter Correct UserName");
        }

    }

}
