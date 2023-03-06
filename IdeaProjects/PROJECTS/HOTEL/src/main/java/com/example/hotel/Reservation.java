package com.example.hotel;

import java.util.Date;

public class Reservation {

    private int reservation_id;
    private int hotel_id;
    private int room_id;
    private String startDay;
    private String endDaY;

    public Reservation(int reservation_id, int hotel_id, int room_id, String startDay, String endDaY) {
        this.reservation_id = reservation_id;
        this.hotel_id = hotel_id;
        this.room_id = room_id;
        this.startDay = startDay;
        this.endDaY = endDaY;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public String getStartDay() {
        return startDay;
    }

    public String getEndDaY() {
        return endDaY;
    }
}
