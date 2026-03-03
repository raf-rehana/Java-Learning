
package evidenceexam.interf;

public class POS {

    public static void main(String[] args) {

        Supershops shop = new Supershops();

        shop.addItem("Apple", 350);
        shop.addItem("Orange", 400);

        shop.printReceipt();
        shop.makePayment(1000);
    }
}
