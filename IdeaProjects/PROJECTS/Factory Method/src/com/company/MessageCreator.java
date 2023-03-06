package com.company;

public abstract class MessageCreator {
    public Message getMessage() {

        Message msg = createMessage();
        return msg;
    }

    //Factory method
    public abstract Message createMessage();


}
