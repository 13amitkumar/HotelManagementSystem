package com.ak;

public class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " has been successfully booked.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}