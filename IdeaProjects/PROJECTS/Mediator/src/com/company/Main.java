package com.company;

public class Main {

    public static void main(String[] args) {

        Mediator mediator= new Mediator();
        MyCalender c = new MyCalender();
        SmartWindwo windwo= new SmartWindwo();
        MovingRobot mr= new MovingRobot(mediator);
        CoffeeMachin cm = new CoffeeMachin(mediator);
        Alarm alarm = new Alarm(mediator);
        mediator.SetObject(alarm, c, mr, cm, windwo);
        alarm.snooze();
    }
}
