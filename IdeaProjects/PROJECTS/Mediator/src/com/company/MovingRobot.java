package com.company;

public class MovingRobot {


    Mediator mediator;
    public MovingRobot(Mediator mediator) {

        this.mediator = mediator;
    }

    public void transport(){

        System.out.println(" Robot Transporting ");
        System.out.println(" Reached Destination ");
        mediator.ringAlarm();
        mediator.openWindwo();
    }
}
