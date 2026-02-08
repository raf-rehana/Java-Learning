package banksystem;

import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-----------Creating an Account---------");
                    System.out.print("\nEnter Account Number: ");
                    int accNum = scanner.nextInt();    
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Account Holder Name: ");                  
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    
                    Account account = new Account(accNum, name, balance);                    
                    bank.addAccount(account);
                    break;

                case 2:
                    System.out.println("-------------Deposit Money--------------");
                    System.out.print("\nEnter Account Number: ");
                    int depAccNum = scanner.nextInt();
                    Account depAccount = bank.findAccount(depAccNum);
                    if (depAccount != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        double depAmount = scanner.nextDouble();
                        depAccount.deposit(depAmount);
                    }
                    break;

                case 3:
                    System.out.println("--------------Withdraw Money------------");
                    
                    System.out.print("\nEnter Account Number: ");
                    int withAccNum = scanner.nextInt();
                   
                    Account withAccount = bank.findAccount(withAccNum);
                    if (withAccount != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double withAmount = scanner.nextDouble();
                        withAccount.withdraw(withAmount);
                    }
                    break;

                case 4:
                    System.out.print("\nEnter Account Number: ");
                    int checkAccNum = scanner.nextInt();                  
                    Account checkAccount = bank.findAccount(checkAccNum);
                    
                    if (checkAccount != null) {
                        checkAccount.showAccountDetails();
                    }
                    break;

                case 5:
                    System.out.println("\n---------------All Accounts-------------");
                    bank.showAllAccounts();
                    break;

                case 6:
                    System.out.println("\nExiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
  
}
