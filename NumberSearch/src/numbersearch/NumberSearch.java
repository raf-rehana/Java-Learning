
package numbersearch;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number to Search: ");
        int search = scanner.nextInt();
        boolean found = false;
        int[] numbers = {1, 4, 5, 8, 2, 90, 56, 34, 900, 678, 434, 23, 456, 260, 344, 78};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {
                System.out.println("The Number " + (search) + " Has Been Found At Position! " + (i + 1) );
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The Number " + (search)+ " Wasn't Found in the List!");
        }
    }
    
}
