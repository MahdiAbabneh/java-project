package com.company;

public class Main {

    public static void main(String[] args) {

        VehicleTemplate car =new Car();
        System.out.println("#Car :");
        car.buildVehicle();
        System.out.println("------------------------------------------------------------");
        VehicleTemplate truck=new Truck();
        System.out.println("#Truck :");
        truck.buildVehicle();
    }
}
