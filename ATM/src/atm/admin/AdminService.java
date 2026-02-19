package atm.admin;

import atm.model.Customer;

import java.util.List;

public class AdminService {

    private List<Customer> customers;

    public AdminService(List<Customer> customers) {
        this.customers = customers;
    }

    public void createCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    public void deleteCustomer(String customerId) {
        customers.removeIf(c -> c.getCustomerId().equals(customerId));
        System.out.println("Customer removed with ID: " + customerId);
    }

    public void viewAllCustomers() {
        System.out.println("Customers List:");
        for (Customer c : customers) {
            System.out.println(c.getCustomerId() + " - " + c.getName());
        }
    }

    public void unlockCustomerAccount(String customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(customerId)) {
                c.unlockAccount();
                System.out.println("Account unlocked for customer: " + c.getName());
                return;
            }
        }
        System.out.println("Customer ID not found.");
    }
}
