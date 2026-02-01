package practicemethod;

import java.util.Scanner;

public class PracticeMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        masud(name, age);
        
    }

   
    static void masud(String name, int age ){
        System.out.println("Welcome " + name + "! you are " + age + " years old! " );
    } 
}
