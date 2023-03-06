package com.example.joinjdbc;

public class books {

    private int id;
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public books(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
