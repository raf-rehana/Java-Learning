package atm.service;

import atm.exception.InsufficientBalanceException;
import atm.model.Account;
import atm.model.Customer;

public class ATMService {

    public boolean login(Customer customer, String pin) {
        return customer.validatePin(pin);
    }

    public void checkBalance(Customer customer) {
        System.out.println("Current balance: " + customer.getAccount().getBalance());
    }

    public void deposit(Customer customer, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        customer.getAccount().deposit(amount);
        System.out.println("Deposit successful. Amount: " + amount);
    }

    public void withdraw(Customer customer, double amount) {
        try {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
                return;
            }
            Account account = customer.getAccount();
            account.withdraw(amount);
            System.out.println("Withdrawal successful. Amount: " + amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void miniStatement(Customer customer) {
        customer.getAccount().printMiniStatement();
    }
}
