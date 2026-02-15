package atm.model;

import atm.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if ((balance - amount) < MIN_BALANCE) {
            throw new InsufficientBalanceException("Balance cannot go below minimum balance of " + MIN_BALANCE);
        }
        balance -= amount;
        addTransaction("Withdraw", amount);
    }
}
