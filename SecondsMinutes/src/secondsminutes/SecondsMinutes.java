
package secondsminutes;

import java.util.Scanner;


public class SecondsMinutes {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Seconds: ");
        int totalSeconds = scanner.nextInt();
        
        int hour = totalSeconds/3600;
        int remainingSeconds = totalSeconds % 3600;
        int minute = remainingSeconds/60;
        int second = remainingSeconds % 60;
      
        System.out.println("Total Time Is: " + hour + " Hour " + minute + " Minutes " + second + " Seconds" );
    }
    
}
