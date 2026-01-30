package taxcalculate;

import java.util.Scanner;

public class TaxCalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Marital Status: ");
        String status = scanner.nextLine().toLowerCase();

        System.out.println("Enter Your Income: ");
        float income = scanner.nextFloat();

        if (status.equals("single")) {
            if (income <= 8350) {
                System.out.println("Your tax is: " + income * 0.10);
            } else if (income<=33950) {
                System.out.println("Your tax is: " + income * 0.15);
            } else if (income<=82250) {
                System.out.println("Your tax is: " + income * 0.25);
            } else if (income<171550) {
                System.out.println("Your tax is: " + income *0.30);
            } else if(income<372950) {
                System.out.println("Your tax is: " + income * 0.35);
            } 

        } else if (income == 20000 && status.equals("married")) {
            System.out.println("Your tax is: " + income * 15 / 100);

        } else if (income == 40000 && status.equals("widow")) {
            System.out.println("Your tax is: " + income * 20 / 100);

        } else {
            System.out.println("Your tax is zero");
        }
    }

}
