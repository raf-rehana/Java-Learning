package CashSystem;


public class account {

    private long accountNumber;
    private long balance;
    private String name;
    private int pin;

    public account(long accountNumber, long balance, String name, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.pin = pin;
    }


    public long getAccountNumber() { return accountNumber; }
    public long getBalance() { return balance; }
    public String getName() { return name; }
    public int getPin() { return pin; }


    public void setPin(int pin) { this.pin = pin; }


    public void addBalance(long amount) { balance += amount; }
    
    public void deductBalance(long amount) { balance -= amount; }


    public void accountDetails(int inputPin) {
        if (inputPin == pin) {
            System.out.println("\n--- Account Details ---");
            System.out.println("Name: " + name);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Wrong PIN.");
        }
    }


    public void changePin(int oldPin, int newPin, int confirmPin) {
        if (oldPin != pin) {
            System.out.println("Wrong old PIN!");
            return;
        }
        if (newPin != confirmPin) {
            System.out.println("PINs do not match!");
            return;
        }
        pin = newPin;
        System.out.println("PIN changed successfully!");
    }
}
