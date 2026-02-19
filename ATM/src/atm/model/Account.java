package atm.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    protected String accountNumber;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Deposit common to all accounts
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    // Abstract withdraw - different rules for each account type
    public abstract void withdraw(double amount);

    // Add transaction utility
    protected void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    // Show mini statement
    public void printMiniStatement() {
        System.out.println("Mini Statement for Account: " + accountNumber);
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
