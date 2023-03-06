package com.example.hotel;

public class Admin {

    private int id;
    private String firstName;
    private String lastName;
    private int reservation_id;
    private int hotel_id;

    public Admin(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
