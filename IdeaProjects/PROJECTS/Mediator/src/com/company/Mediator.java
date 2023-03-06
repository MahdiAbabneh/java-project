package com.company;

public class Mediator {

    Alarm a;
    MyCalender c;
    MovingRobot mr;
    CoffeeMachin cm;
    SmartWindwo sw;

    public Mediator() {

    }

    public void SetObject(Alarm a, MyCalender c, MovingRobot mr, CoffeeMachin cm, SmartWindwo sw) {
        this.a = a;
        this.c = c;
        this.mr = mr;
        this.cm = cm;
        this.sw = sw;
    }


    public int getTime() {
        return this.c.getTime();
    }

    public void makeCoffee() {
        this.cm.start();
    }

    public void trnsport() {
        this.mr.transport();
    }

    public void ringAlarm() {

        this.a.ring();
    }


    public void openWindwo() {

        this.sw.open();
    }
}

