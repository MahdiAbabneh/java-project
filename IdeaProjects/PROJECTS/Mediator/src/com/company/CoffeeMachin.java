package com.company;

public class CoffeeMachin {

    Mediator mediator;
    public CoffeeMachin(Mediator mediator) {

        this.mediator = mediator;
    }

    public void start(){

        System.out.println("Preapirin Coffee");
        System.out.println("Finshed Preapirin Coffee");
        int day = mediator.getTime();
        if (day == 3){

            System.out.println(" Adding Sugar");
        }

        mediator.trnsport();
    }
}
