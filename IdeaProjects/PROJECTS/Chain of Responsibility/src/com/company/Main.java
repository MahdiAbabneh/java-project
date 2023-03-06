package com.company;

public class Main {

    public static void main(String[] args) {

        String link1 ="www.facebook.com";
        String link2="www.youtube.com";
        String link3="www.instagram.com";

        YoutubeHandler youtube=new YoutubeHandler();
        FacebookHandler facebook=new FacebookHandler();
        InstagramHandler instagram=new InstagramHandler();

        Video video=new Video();
        video.setLink(link3);

        youtube.setNextHandler(facebook);
        facebook.setNextHandler(instagram);

        youtube.handleLink(video);



    }
}
