package BankSystem;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println(" Withdrawal denied. Overdraft limit exceeded!");
        }
    }
}
