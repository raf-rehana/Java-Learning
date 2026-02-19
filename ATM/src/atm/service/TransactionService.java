package atm.service;

import atm.model.Customer;
import atm.model.Transaction;

import java.util.List;

public class TransactionService {

    public void printAllTransactions(Customer customer) {
        List<Transaction> transactions = customer.getAccount().getTransactions();
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("All Transactions:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
