package com.airbnb.rooms.model;

public class Room {
    private int roomNumber;
    private int beds;
    private int costPerNight;
    private boolean reserved;

    public Room(int roomNumber, int beds, int costPerNight, boolean reserved) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.costPerNight = costPerNight;
        this.reserved = reserved;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(int costPerNight) {
        this.costPerNight = costPerNight;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
