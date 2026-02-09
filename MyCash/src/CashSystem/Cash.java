package CashSystem;

public class Cash {


    public void cashIn(account user, long amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            return;
        }
        user.addBalance(amount);
        System.out.println("Cash In Successful");
        System.out.println("New Balance for " + user.getName() + ": " + user.getBalance() + " Taka");
    }


    public void cashOut(account user, long amount, int inputPin) {
        if (inputPin != user.getPin()) {
            System.out.println(" Wrong PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount. Must be greater than 0.");
            return;
        }

        if (amount > user.getBalance()) {
            System.out.println("Insufficient balance. Current Balance: " + user.getBalance() + " Taka");
            return;
        }

        user.deductBalance(amount);
        System.out.println("Cash Out Successful");
        System.out.println("New Balance for " + user.getName() + ": " + user.getBalance() + " Taka");
    }

 
    public void checkBalance(account user) {
        System.out.println("Current Balance for " + user.getName() + ": " + user.getBalance() + " Taka");
    }


    public void transferMoney(account sender, account receiver, long amount, int inputPin) {

        if (inputPin != sender.getPin()) {
            System.out.println("Wrong PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            return;
        }

        if (sender.getBalance() < amount) {
            System.out.println("Insufficient balance. Current Balance: " + sender.getBalance() + " Taka");
            return;
        }

        sender.deductBalance(amount);
        receiver.addBalance(amount);

        System.out.println("Transfer Successful");
        System.out.println("Sent " + amount + " Taka from " + sender.getName() + " to " + receiver.getName());
        System.out.println("Your New Balance: " + sender.getBalance() + " Taka");
    }
}
