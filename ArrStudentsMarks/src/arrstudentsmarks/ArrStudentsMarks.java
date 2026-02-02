package arrstudentsmarks;

import java.util.Scanner;

public class ArrStudentsMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int number = scanner.nextInt();

        int[] marks = new int[number];

 
        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

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

        double average = (double) sum / number;


        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

        scanner.close();
    }
}
