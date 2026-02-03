package arrstudentsmarks;

import java.util.Scanner;

public class ArrStudentsMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int number = scanner.nextInt();

        int[] marks = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks of " + numberPosition(i + 1) + " Student: ");
            marks[i] = scanner.nextInt();
        }
        marksAnalyzer(marks);

    }
        
     public static void marksAnalyzer(int[] marks){
         int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int pass = 0;
        int fail = 0;

        for (int mark : marks) {
            sum += mark;

            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }

            if (mark >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        float average = sum / marks.length;

        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

    }
         
     
    public static String numberPosition(int number) {
        
//        switch (number) { 
//            case 1: System.out.println("st"); break;
//            case 2: System.out.println("nd"); break; 
//            case 3: System.out.println("rd"); break; 
//            default: System.out.println("th"); break; }

        if (number % 10 == 1 && number % 100 != 11) {
            return number + "st";
        } else if (number % 10 == 2 && number % 100 != 12) {
            return number + "nd";
        } else if (number % 10 == 3 && number % 100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
}

