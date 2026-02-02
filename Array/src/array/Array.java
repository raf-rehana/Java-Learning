package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int number = scanner.nextInt();

        int[] marks = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int max = marks[0];
        int min = marks[0];

        for (int mark : marks) {

            if (mark > max) {
                max = mark;
            }
            if (mark < min) {
                min = mark;
            }
        }
    }
}
