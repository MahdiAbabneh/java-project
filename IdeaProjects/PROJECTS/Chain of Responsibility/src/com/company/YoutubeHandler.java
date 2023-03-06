package com.company;

public class YoutubeHandler implements Ihandler {

    Ihandler ihandler;

    @Override
    public void setNextHandler(Ihandler iHandler) {
        ihandler= iHandler;
    }

    @Override
    public void handleLink(Video video) {

        if(video.getLink().contains("youtube"))
        {
            System.out.println("I can handle it");
        }
        else
        {
            System.out.println("I am youtube : I can not handle it , I will pass your request to my friend ");
            ihandler.handleLink(video);
        }

    }
}
