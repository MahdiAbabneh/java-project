package com.example.hotel;

public class Hotel {
    private int hotel_id;
    private String hotel_name;
    private int room_id;
    private String country;

    public Hotel(int hotel_id, String hotel_name, int room_id, String country) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.room_id = room_id;
        this.country = country;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public int getRoom_id() {
        return room_id;
    }

    public String getCountry() {
        return country;
    }
}
