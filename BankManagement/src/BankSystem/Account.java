package BankSystem;

public class Account {

    public int accountNumber;
    public String accountHolder;
    public double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
     public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }
     
       public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
     
     
}
