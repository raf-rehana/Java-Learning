 
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        
        System.out.print("Choose Operations(+, -, *, /): ");
        char operator = input.next().charAt(0);

        int result = 0;
        boolean error = false;
       
            if(operator == '+'){
                 result = number1 + number2;
            }else if(operator == '-'){
                result = number1 - number2;
            } else if (operator == '*'){
                result = number1 * number2;
            }else if (operator == '/'){
                if(number1 != 0){
                    result =  number1 / number2;
                }else{
                    System.out.println("Cannot divide by a Number");
                    error = true;
                }
            } else{
                System.out.println("Invalid Operator!");
                error = true;
            }
                
            if(!error){
                 System.out.println("Result Is: " + result );
            }
           
 
       
    }
    
}
