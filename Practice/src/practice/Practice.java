package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.next();

//        System.out.println("Hello " + name.substring(0, 1).toUpperCase()
//                             + name.substring(1).toLowerCase()+ "!");

        System.out.println("Hello " + name.substring(0, 1).toUpperCase()
                            + name.substring(1, name.length() - 1).toLowerCase()
                            + name.substring(name.length() - 1).toUpperCase() + "!");
   
    }
}

//https://tasks.idb-bisew.xyz/exam/mcq.php