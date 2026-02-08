package bankmanagementsystem;

import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int accountNumber = 0;
        double balance = 0;
        boolean accountCreated = false;

        int choice;

        do {
            System.out.println("\n--------------- BANK MENU ----------------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Info");
            System.out.println("6. Exit");

            System.out.print("Choose an Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    if (accountCreated) {
                        System.out.println("\nAccount already exists!");
                        break;
                    }
                    System.out.print("\nEnter Your Name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();

                    System.out.print("Enter Initial Balance: ");
                    balance = scanner.nextDouble();                    
                    while (balance < 0) {
                        System.out.println("Invalid Amount! Enter positive balance.");
                        balance = scanner.nextDouble();
                    }

                    accountCreated = true;
                    System.out.println("\nAccount Created Successfully!");
                    break;

                case 2:
                    if (!accountCreated) {
                        System.out.println("\nPlease create an account First!");
                        break;
                    }

                    System.out.print("\nEnter Amount to Deposit: ");
                    double deposit = scanner.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid Amount!");
                    } else {
                        balance += deposit;
                        System.out.println("Deposited " + deposit + " Taka");
                    }
                    break;

                case 3:
                    if (!accountCreated) {
                        System.out.println("\nPlease create an account First!");
                        break;
                    }

                    System.out.print("\nEnter Amount to Withdraw: ");
                    double withdraw = scanner.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid Amount!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn " + withdraw + " Taka");
                    }
                    break;

                case 4:
                    if (!accountCreated) {
                        System.out.println("\nPlease create an account First!");
                        break;
                    }
                    System.out.println("\nBalance is: " + balance + " Taka");
                    break;

                case 5:
                    if (!accountCreated) {
                        System.out.println("\nPlease create an account First!");
                        break;
                    }
                    System.out.println("\n--------- Account Information --------");
                    System.out.println("Account Holder Name: " + name);
                    System.out.println("Account No: " + accountNumber);
                    System.out.println("Balance: " + balance + " Taka");
                    break;

                case 6:
                    System.out.println("\nThank you for using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

    }
}
