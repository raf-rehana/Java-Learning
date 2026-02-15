package atm.model;

public class Customer {

    private String customerId;
    private String name;
    private String pin;
    private boolean isLocked = false;
    private int wrongAttempts = 0;
    private Account account;

    public Customer(String customerId, String name, String pin, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.pin = pin;
        this.account = account;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean validatePin(String inputPin) {
        if (isLocked) {
            return false;
        }

        if (pin.equals(inputPin)) {
            wrongAttempts = 0; 
            return true;
        } else {
            wrongAttempts++;
            if (wrongAttempts >= 3) {
                isLocked = true;
            }
            return false;
        }
    }

    public void unlockAccount() {
        isLocked = false;
        wrongAttempts = 0;
    }
}
