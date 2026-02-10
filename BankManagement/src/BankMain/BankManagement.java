
package BankMain;

import BankSystem.CurrentAccount;
import BankSystem.SavingsAccount;

public class BankManagement {

    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(12941, "Rafiaah", 50000, 5);
        savingsAccount.displayAccountInfo();
        savingsAccount.addInterest();
        savingsAccount.displayAccountInfo();

        System.out.println();


        CurrentAccount currentAccount = new CurrentAccount(12942, "Sajin", 20000, 1000);
        currentAccount.displayAccountInfo();
        currentAccount.withdraw(2500);
        currentAccount.withdraw(1000);
        currentAccount.displayAccountInfo();
    

    }
    
}
