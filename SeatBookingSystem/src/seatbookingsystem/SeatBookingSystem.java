
package seatbookingsystem;

import java.util.Scanner;

public class SeatBookingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of seats per row: ");
        int cols = scanner.nextInt();

        int[][] seats = new int[rows][cols];
        int choice;

        do {
            System.out.println("\n--- SEAT BOOKING MENU ---");
            System.out.println("1. Show Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Available Seats");
            System.out.println("5. Exit");
            
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    showSeats(seats);
                    break;

                case 2:
                    System.out.print("Enter row number: ");
                    int bookRow = scanner.nextInt() - 1;

                    System.out.print("Enter seat number: ");
                    int bookCol = scanner.nextInt() - 1;

                    if (bookRow >= 0 && bookRow < rows && bookCol >= 0 && bookCol < cols) {
                        if (seats[bookRow][bookCol] == 0) {
                            seats[bookRow][bookCol] = 1;
                            System.out.println("Seat booked successfully!");
                        } else {
                            System.out.println("Seat already booked!");
                        }
                    } else {
                        System.out.println("Invalid seat number!");
                    }
                    break;

                case 3:
                    System.out.print("Enter row number: ");
                    int cancelRow = scanner.nextInt() - 1;

                    System.out.print("Enter seat number: ");
                    int cancelCol = scanner.nextInt() - 1;

                    if (cancelRow >= 0 && cancelRow < rows && cancelCol >= 0 && cancelCol < cols) {
                        if (seats[cancelRow][cancelCol] == 1) {
                            seats[cancelRow][cancelCol] = 0;
                            System.out.println("Booking cancelled!");
                        } else {
                            System.out.println("Seat is already empty!");
                        }
                    } else {
                        System.out.println("Invalid seat number!");
                    }
                    break;

                case 4:
                    int available = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (seats[i][j] == 0) {
                                available++;
                            }
                        }
                    }
                    System.out.println("Available seats: " + available);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void showSeats(int[][] seats) {
        System.out.println("\nSeat Layout (0 = Empty, 1 = Booked):");
        
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}