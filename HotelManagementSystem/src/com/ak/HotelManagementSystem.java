package com.ak;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHotel Management System");
            System.out.println("1. Book Room");
            System.out.println("2. Check Room Availability");
            System.out.println("3. Customer Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.bookRoom();  // Book a room
                    break;
                case 2:
                    hotel.checkAvailability();  // Check room availability
                    break;
                case 3:
                    hotel.displayCustomerDetails();  // Display customer details
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}