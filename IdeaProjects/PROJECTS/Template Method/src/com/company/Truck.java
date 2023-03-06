package com.company;

public class Truck extends VehicleTemplate{
    @Override
    protected void installGearBox() {
        System.out.println("Installing 6 shifts gear box for truck");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("Adding extra truck container");
    }
}
