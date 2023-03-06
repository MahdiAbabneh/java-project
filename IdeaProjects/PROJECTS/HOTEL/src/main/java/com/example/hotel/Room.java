package com.example.hotel;

public class Room {

    private int room_id;
    private double cost;
    private boolean available;

    public Room(int room_id, double cost, boolean available) {
        this.room_id = room_id;
        this.cost = cost;
        this.available = available;
    }

    public int getRoom_id() {
        return room_id;
    }

    public double getCost() {
        return cost;
    }

    public boolean isAvailable() {
        return available;
    }
}
