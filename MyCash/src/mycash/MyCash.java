package mycash;

import java.util.ArrayList;
import java.util.Scanner;
import CashSystem.account;
import CashSystem.Cash;

public class MyCash {

    public static Scanner scan = new Scanner(System.in);
    public static Cash cashService = new Cash();

    public static ArrayList<account> accounts = new ArrayList<>();
    
    public static account currentUser = null;
    
    public static long nextAccountNumber = 12949;

    public static void main(String[] args) {

        accounts.add(new account(12940, 15000, "Syed Sajin", 12345));
        accounts.add(new account(12941, 12000, "Israt Jui", 12345));
        accounts.add(new account(12942, 500000, "Rafiaah Nur", 12345));
        accounts.add(new account(12943, 10000, "Sadiya Jahan", 12345));
        accounts.add(new account(12944, 50000, "Mishkat", 12345));
        accounts.add(new account(12945, 90000, "Mahbub Sheikh", 12345));
        accounts.add(new account(12946, 80000, "Sabbir Hasan", 12345));
        accounts.add(new account(12947, 10000, "Badrul Hasan", 12345));
        accounts.add(new account(12948, 11000, "Shaharan Hossain1", 12345));

        startMenu();
    }

    public static void startMenu() {
        while (true) {
            System.out.println("\n======= MyCash =========");
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Choose Option: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 :
                    login();
                case 2 :
                    createAccount();
                case 3 :
                    exitMenu();
                default :
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void createAccount() {
        scan.nextLine();
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Set 5-digit PIN: ");
        int pin = scan.nextInt();

        System.out.print("Initial deposit amount: ");
        long balance = scan.nextLong();

        account newAcc = new account(nextAccountNumber, balance, name, pin);
        accounts.add(newAcc);

        System.out.println("\nAccount created successfully!");
        System.out.println("Your Account Number: " + nextAccountNumber);

        nextAccountNumber++;
    }

    public static void login() {
        System.out.print("\nAccount Number: ");
        long accNo = scan.nextLong();

        System.out.print("PIN: ");
        int pin = scan.nextInt();

        for (account a : accounts) {
            if (a.getAccountNumber() == accNo && a.getPin() == pin) {
                currentUser = a;
                System.out.println("\nWelcome " + a.getName() + "!");
                home();
                return;
            }
        }
        System.out.println("Invalid account or PIN");
    }

    public static void home() {
        while (true) {
            System.out.println("\n===== MyCash MENU =====");
            System.out.println("1. Cash In");
            System.out.println("2. Cash Out");
            System.out.println("3. Transfer Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Account Details");
            System.out.println("6. Check Balance");
            System.out.println("7. Logout");
            
            System.out.print("Choose Option: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 :
                    cashIn();
                case 2 :
                    cashOut();
                case 3 :
                    transfer();
                case 4 :
                    changePin();
                case 5 :
                    accountDetails();
                case 6 :
                    cashService.checkBalance(currentUser);
                case 7 : {
                    currentUser = null;
                    return;
                }
                default :
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void cashIn() {
        System.out.print("Enter amount: ");
        long amount = scan.nextLong();
        cashService.cashIn(currentUser, amount);
    }

    public static void cashOut() {
        System.out.print("Enter Amount: ");
        long amount = scan.nextLong();

        System.out.print("Enter PIN: ");
        int pin = scan.nextInt();

        cashService.cashOut(currentUser, amount, pin);
    }

    public static void transfer() {
        System.out.print("Receiver Account Number: ");
        long receiverAcc = scan.nextLong();

        account receiver = null;

        for (account a : accounts) {
            if (a.getAccountNumber() == receiverAcc) {
                receiver = a;
                break;
            }
        }

        if (receiver == null) {
            System.out.println("Receiver not found.");
            return;
        }

        System.out.print("Enter amount: ");
        long amount = scan.nextLong();

        System.out.print("Enter PIN: ");
        int pin = scan.nextInt();

        cashService.transferMoney(currentUser, receiver, amount, pin);
    }

    public static void changePin() {
        System.out.print("Enter Old PIN: ");
        int oldPin = scan.nextInt();

        System.out.print("Enter New PIN: ");
        int newPin = scan.nextInt();

        System.out.print("Confirm New PIN: ");
        int confirmPin = scan.nextInt();

        currentUser.changePin(oldPin, newPin, confirmPin);
    }

    public static void accountDetails() {
        System.out.print("Enter PIN: ");
        int pin = scan.nextInt();
        currentUser.accountDetails(pin);
    }

    public static void exitMenu() {
        System.out.println("Thank you for using MyCash.");
        System.exit(0);
    }
}
