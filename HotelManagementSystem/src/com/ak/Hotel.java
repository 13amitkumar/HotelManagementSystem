package com.ak;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Customer> customers;

    public Hotel() {
        rooms = new ArrayList<>();
        customers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i));  // Create 10 rooms
        }
    }

    // Method to book a room
    public void bookRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room number to book (1-10): ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            Room room = rooms.get(roomNumber - 1);
            if (!room.isBooked()) {
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine(); // Read the full name

                System.out.print("Enter customer age: ");
                while (!scanner.hasNextInt()) { // Validate age input
                    System.out.println("Invalid age. Please enter a valid number.");
                    scanner.next();  // Consume invalid input
                }
                int age = scanner.nextInt();

                Customer customer = new Customer(name, age);
                customers.add(customer);
                room.bookRoom();
            } else {
                System.out.println("Room " + roomNumber + " is already booked.");
            }
        } else {
            System.out.println("Invalid room number.");
        }
    }

    // Method to check room availability
    public void checkAvailability() {
        System.out.println("Room availability:");
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + " - " + (room.isBooked() ? "Booked" : "Available"));
        }
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        if (customers.isEmpty()) {
            System.out.println("No customers have booked rooms yet.");
        } else {
            for (Customer customer : customers) {
                customer.displayCustomerDetails();
            }
        }
    }
}