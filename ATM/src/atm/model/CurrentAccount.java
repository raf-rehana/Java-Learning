package atm.model;

import atm.exception.InsufficientBalanceException;

public class CurrentAccount extends Account {

    private double overdraftLimit = 10000;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            throw new InsufficientBalanceException("Withdrawal exceeds overdraft limit!");
        }
        balance -= amount;
        addTransaction("Withdraw", amount);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
