package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        playWithVehicle(car);

        System.out.println();
        //Bicycle bicycle=new Bicycle();
        //playWithVehicle(bicycle);

        //Vehicle bicycle = new BicycleAdapter(new Bicycle());
        //playWithVehicle(bicycle);

    }
    private static void playWithVehicle(Vehicle vehicle) {

        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();

}}
