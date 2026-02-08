package Price;

public class GroceryPrice {

    public int unit;
    public double unitprice;
    public double totalPrice;
    public double discount;
    public double finalPrice;

    public double getTotalPrice(){
        totalPrice = unit * unitprice ;
        return totalPrice;
    }
    public double getDiscount() {
        if (totalPrice <= 100) {
            discount = totalPrice * 0.02;
        } else if (totalPrice <= 200) {
            discount = totalPrice * 0.03;
        } else if (totalPrice <= 300) {
            discount = totalPrice * 0.04;
        } else if (totalPrice <= 400) {
            discount = totalPrice * 0.05;
        } else if (totalPrice <= 500) {
            discount = totalPrice * 0.06;
        } else {
            discount = totalPrice * 0.10;

        }
        return discount;
    }

    public double getFinalPrice() {

        if (totalPrice <= 100) {
            finalPrice = totalPrice - discount;
        } else if (totalPrice <= 200) {
            finalPrice = totalPrice - discount;
        } else if (totalPrice <= 300) {
            finalPrice = totalPrice - discount;
        } else if (totalPrice <= 400) {
            finalPrice = totalPrice - discount;
        } else if (totalPrice <= 500) {
            finalPrice = totalPrice - discount;
        } else {
            finalPrice = totalPrice - discount;

        }

        return finalPrice;
    }

}
