package com.company;

public class Alarm {

    Mediator mediator;
    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }


    public void snooze(){

        int day= mediator.getTime();
        if (day != 0 && day != 6 ){

            mediator.makeCoffee();
        }
    }


    public void ring(){

        System.out.println("Ringinnnnnnnnn");
    }
}
