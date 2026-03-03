
package evidenceexam.interf;

public class Supershops implements PosService {


    double total = 0;

    @Override
    public void addItem(String item, double price) {
        System.out.println(item + " : " + price);
        total += price;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("\nPayment received: " + amount);
        System.out.println("Change: " + (amount - total));
    }

    @Override
    public void printReceipt() {
        System.out.println("\nTotal bill: " + total);
    }
}

