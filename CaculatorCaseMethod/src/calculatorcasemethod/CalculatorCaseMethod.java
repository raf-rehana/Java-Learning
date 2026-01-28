 
package calculatorcasemethod;

import java.util.Scanner;

public class CalculatorCaseMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Choose Operations(+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        System.out.print("Enter Second Number: ");
        double number2 = input.nextDouble();
        
       

        double result = 0;
        boolean error = false;
       
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if(number2 != 0){
                    result =  number1 / number2;
                }else{
                    System.err.println("Number Can't Divide By  zero");
                    error = true;
                }
                break;
            default:
                System.out.println("Invalid Operator!");
                error = true;
                break;
        }
                
            if(!error){
                 System.out.println("Result: "+ number1 + operator + number2 + " = "  + result );
            }
           
 
       
    }
    
}
