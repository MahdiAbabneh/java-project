package com.company;

public class Main {

    public static void main(String[] args) {

        PlayerReceiver player=new PlayerReceiver();

        JoyStickInvoker joyStick=new JoyStickInvoker();

        if (player.hasBall()){
            joyStick.setCommand(new LongPass());
        }
        else {
            joyStick.setCommand(new Tackling());
        }
        joyStick.doAction();

    }
}
