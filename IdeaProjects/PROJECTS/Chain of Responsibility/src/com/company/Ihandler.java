package com.company;



public interface Ihandler {

     void setNextHandler(Ihandler iHandler);
     void handleLink(Video video);
}
