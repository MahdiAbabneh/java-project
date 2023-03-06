package com.example.hotel;

public class User {
    private int user_id;
    private int room_id;
    private int hotel_id;
    private String first_name;
    private String last_name;
    private String phone;
    private String country;

    public User(int user_id, int room_id, int hotel_id, String first_name, String last_name, String phone, String country) {
        this.user_id = user_id;
        this.room_id = room_id;
        this.hotel_id = hotel_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.country = country;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }
}
