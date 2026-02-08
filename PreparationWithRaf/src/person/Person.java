package person;

import personAllCategory.Student;
import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Students's Data You want to see? : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Student[] personCount = new Student[count];

        for (int i = 0; i < personCount.length; i++) {

            System.out.print("What's the Name of  Person " +(i+1) + "? : ");
            String name = scanner.nextLine();

            System.out.print("What's the Age of " + name + " ? : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What's the Father's Name of " + name + "? :");
            String fatherName = scanner.nextLine();
            
             System.out.print("What's the Mother's Name of " + name + "? :");
            String motherName = scanner.nextLine();

            personCount[i]  = new Student(name, age, fatherName, motherName);
            
            System.out.println("-----------------------------------------");
          
        }
        for(Student person: personCount){
            System.out.println(person);
        }
       
        
        //System.out.println(person1.toString());
        //System.out.println(person2.toString());
    }
}
