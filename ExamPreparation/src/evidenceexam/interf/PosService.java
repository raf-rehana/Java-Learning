
package evidenceexam.interf;

public interface PosService {
    
    
    void addItem(String item, double price);
    
    void makePayment(double amount);
    
    void printReceipt();

}
