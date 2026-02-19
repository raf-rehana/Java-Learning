package atm;

import atm.admin.Admin;
import atm.admin.AdminService;
import atm.exception.InvalidPinException;
import atm.model.*;
import atm.service.ATMService;
import atm.service.AuthenticationService;
import atm.util.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private static List<Customer> customers = new ArrayList<>();
    private static ATMService atmService = new ATMService();
    private static AuthenticationService authService = new AuthenticationService();
    private static AdminService adminService = new AdminService(customers);
    private static Admin admin = new Admin("admin", "admin123");

    public static void main(String[] args) {

        // Sample data
        customers.add(new Customer("C001", "John Doe", "1234", new SavingsAccount("SA1001", 10000)));
        customers.add(new Customer("C002", "Jane Smith", "4321", new CurrentAccount("CA1002", 5000)));

        boolean running = true;

        while (running) {
            System.out.println("\n====== Welcome to Bank ATM ======");
            System.out.println("1. Customer Login");
            System.out.println("2. Admin Login");
            System.out.println("3. Exit");
            int choice = InputUtil.getInt("Choose an option: ");

            switch (choice) {
                case 1 -> customerFlow();
                case 2 -> adminFlow();
                case 3 -> {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void customerFlow() {
        String customerId = InputUtil.getString("Enter Customer ID: ");
        Customer customer = findCustomerById(customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (customer.isLocked()) {
            System.out.println("Account is locked. Contact admin.");
            return;
        }

        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3) {
            String pin = InputUtil.getString("Enter PIN: ");
            try {
                authService.authenticate(customer, pin);
                authenticated = true;
                break;
            } catch (InvalidPinException e) {
                System.out.println(e.getMessage());
                attempts++;
                if (attempts == 3) {
                    System.out.println("Account locked due to multiple invalid PIN attempts.");
                }
            }
        }

        if (!authenticated) return;

        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Mini Statement");
            System.out.println("5. Logout");
            int option = InputUtil.getInt("Choose an option: ");

            switch (option) {
                case 1 -> atmService.checkBalance(customer);
                case 2 -> {
                    double amount = InputUtil.getDouble("Enter deposit amount: ");
                    atmService.deposit(customer, amount);
                }
                case 3 -> {
                    double amount = InputUtil.getDouble("Enter withdrawal amount: ");
                    atmService.withdraw(customer, amount);
                }
                case 4 -> atmService.miniStatement(customer);
                case 5 -> {
                    System.out.println("Logged out.");
                    loggedIn = false;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void adminFlow() {
        String username = InputUtil.getString("Enter Admin Username: ");
        String password = InputUtil.getString("Enter Admin Password: ");

        if (!admin.getUsername().equals(username) || !admin.checkPassword(password)) {
            System.out.println("Invalid admin credentials.");
            return;
        }

        boolean adminLoggedIn = true;
        while (adminLoggedIn) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View Customers");
            System.out.println("2. Add Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Unlock Customer Account");
            System.out.println("5. Logout");

            int choice = InputUtil.getInt("Choose an option: ");

            switch (choice) {
                case 1 -> adminService.viewAllCustomers();
                case 2 -> {
                    String cid = InputUtil.getString("Enter new Customer ID: ");
                    String name = InputUtil.getString("Enter Customer Name: ");
                    String pin = InputUtil.getString("Set PIN for Customer: ");
                    String accType = InputUtil.getString("Account Type (S for Savings, C for Current): ").toUpperCase();

                    Account account;
                    if (accType.equals("S")) {
                        account = new SavingsAccount("SA" + cid, 0);
                    } else if (accType.equals("C")) {
                        account = new CurrentAccount("CA" + cid, 0);
                    } else {
                        System.out.println("Invalid account type.");
                        break;
                    }
                    Customer newCustomer = new Customer(cid, name, pin, account);
                    adminService.createCustomer(newCustomer);
                }
                case 3 -> {
                    String cid = InputUtil.getString("Enter Customer ID to delete: ");
                    adminService.deleteCustomer(cid);
                }
                case 4 -> {
                    String cid = InputUtil.getString("Enter Customer ID to unlock: ");
                    adminService.unlockCustomerAccount(cid);
                }
                case 5 -> {
                    System.out.println("Admin logged out.");
                    adminLoggedIn = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static Customer findCustomerById(String id) {
        return customers.stream()
                .filter(c -> c.getCustomerId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
