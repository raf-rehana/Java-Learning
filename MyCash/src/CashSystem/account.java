package CashSystem;

public class account {

    private long accountNumber;
    private long balance;
    private String name;
    private int pin;

    public account() {
    }

    public account(long accountNumber, long balance, String name, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.pin = pin;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


    public void cashIn(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Cash In Successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }


    public void cashOut(long amount, int inputPin) {
        if (inputPin != pin) {
            System.out.println("Wrong PIN.");
            return;
        }

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Cash Out Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    public void changePin(int oldPin, int newPin, int confirmPin) {
        if (oldPin != pin) {
            System.out.println("Wrong old PIN.");
            return;
        }

        if (newPin != confirmPin) {
            System.out.println("PIN not matching.");
            return;
        }

        pin = newPin;
        System.out.println("PIN changed successfully.");
    }

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

    public void checkBalance() {
        System.out.println("Current Balance: " + balance + " taka");
    }


    public void transferMoney(account receiver, long amount, int inputPin) {
        if (inputPin != pin) {
            System.out.println("Wrong PIN.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (balance < amount) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        receiver.balance += amount;

        System.out.println("Transfer successful!");
        System.out.println("Sent " + amount + " taka to " + receiver.name);
    }
}
