package com.company;

public class LongPass implements Command{

    PlayerReceiver playerReceiver=new PlayerReceiver();

    @Override
    public void execute() {
        playerReceiver.doLongPass();
    }
}
