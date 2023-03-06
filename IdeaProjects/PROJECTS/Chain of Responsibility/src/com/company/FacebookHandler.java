package com.company;

public class FacebookHandler implements Ihandler {

    Ihandler ihandler;

    @Override
    public void setNextHandler(Ihandler iHandler) {
        ihandler= iHandler;
    }

    @Override
    public void handleLink(Video video) {

        if(video.getLink().contains("facebook"))
        {
            System.out.println("I can handle it");
        }
        else
        {
            System.out.println("I am facebook :I can not handle it , I will pass your request to my friend ");
            ihandler.handleLink(video);
        }



    }
}
