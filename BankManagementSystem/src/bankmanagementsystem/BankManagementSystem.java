package bankmanagementsystem;

import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        while (balance < 0) {
            System.out.println("\nInvalid Amount! Please enter a positive balance.");
            System.out.print("Enter Initial Balance: ");
            balance = scanner.nextDouble();
        }
        scanner.nextLine();
        
        int choice;

        do {
            System.out.println("\n---------------BANK MENU----------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Exit");

            System.out.print("Choose a Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Amount To deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("\nInvalid Amount!");
                        continue;

                    } else {
                        balance += deposit;
                        System.out.println("\nDeposited " + deposit + " Taka");
                        System.out.println("New Balance is " + balance + " Taka");
                        break;
                    }

                case 2:
                    System.out.print("\nEnter Amount to Withdraw: ");
                    double withdraw = scanner.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("\nYour Balance is Low!");
                        break;
                    } else if (withdraw <= 0) {
                        System.out.println("\nInvalid Amount!");
                        break;
                    } else {
                        balance -= withdraw;
                        System.out.println("\nwithdrawn " + withdraw + " Taka");
                        System.out.println("New Balance is " + balance + " Taka");
                        break;
                    }

                case 3:
                    System.out.println("\n-----------------Balance------------------");
                    System.out.println("Your Total Balance is " + balance + " Taka");
                    break;

                case 4:
                    System.out.println("\n---------Account Information--------");
                    System.out.println("Name: " + name);
                    System.out.println("Account no: " + accountNumber);
                    System.out.println("Current Balance: " + balance + " Taka");
                    break;

                case 5:
                    System.out.println("\nThank you for using the Bank System!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }
        } while (choice != 5);
    }

}
