
 
package newproject;

import java.util.*;

public class CinemaTicket {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Welcome to our bus service");
        String[][] seats = new String[4][4];
        // Initialize all seats to 'Available'
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = "Available";
            }
        }
        // Main booking and cancellation loop
        while (true) {
            displaySeats(seats);
            System.out.print("Do you want to book (1) or cancel (2) a seat? (0 to exit) = ");
            int action = scan.nextInt();
            if (action == 0) break;
            System.out.println("Enter the row number (0-3):");
            int row = scan.nextInt();
            System.out.println("Enter the column number (0-3):");
            int col = scan.nextInt();
            if (row < 0 || row >= seats.length || col < 0 || col >= seats[row].length) {
                System.out.println("Invalid seat number. Please try again.");
                continue;
            }
            if (action == 1) {
                if (seats[row][col].equals("Available")) {
                    seats[row][col] = "Booked";
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat is already booked.");
                }
            } else if (action == 2) {
                if (seats[row][col].equals("Booked")) {
                    seats[row][col] = "Available";
                    System.out.println("Seat canceled successfully!");
                } else {
                    System.out.println("Seat is not booked.");
                }
            } else {
                System.out.println("Invalid action. Please try again.");
            }
        }
        System.out.println("Thanks for visiting! Have a safe journey!");
        scan.close();
    }
    private static void displaySeats(String[][] seats) {
        System.out.print("  \t");
        for (int j = 0; j < seats[0].length; j++) {
            System.out.print("Column: " + j + "\t");
        }
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row: " + i + "\t");
            for (String seat : seats[i]) {
                System.out.print(seat + "\t");
            }
            System.out.println();
        
        
    }
    

    }
}