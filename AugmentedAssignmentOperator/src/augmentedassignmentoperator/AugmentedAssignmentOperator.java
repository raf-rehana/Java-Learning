
package augmentedassignmentoperator;

import java.util.Scanner;


public class AugmentedAssignmentOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a digit: ");
        int digit = input.nextInt();     
        int result = digit;
        
        if(result<10){
            result =  result += 2;          
        }else if (result<20){
            result =  result -= 5;
        }else if(result<30){
            result =  result/=8;
        }else if(result<40){
            result =  result*=9;
        }else if(result<100){
            result =  result%=11;
        }
        
        System.out.println(result);
    }
    
    
}
