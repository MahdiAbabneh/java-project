package com.company;

public class Tackling implements Command{

    PlayerReceiver playerReceiver=new PlayerReceiver();
    @Override
    public void execute() {
        playerReceiver.doTackling();

    }
}
