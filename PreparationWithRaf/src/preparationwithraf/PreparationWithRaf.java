package preparationwithraf;

import java.util.Scanner;

public class PreparationWithRaf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people's Data You want to see? : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Person[] personCount = new Person[count];

        for (int i = 0; i < personCount.length; i++) {

            System.out.print("What's the Name of  Person " +(i+1) + "? : ");
            String name = scanner.nextLine();

            System.out.print("What's the Age of " + name + " ? : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What's the Occupation of " + name + "? :");
            String occupation = scanner.nextLine();

            personCount[i]  = new Person(name, age, occupation);
            
            System.out.println("-----------------------------------------");
          
        }
        for(Person person: personCount){
            System.out.println(person);
        }
       
        
        //System.out.println(person1.toString());
        //System.out.println(person2.toString());
    }
}
