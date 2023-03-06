package com.company;

public class JoyStickInvoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void doAction(){
        command.execute();
    }
}
