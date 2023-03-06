package com.company;

// class is declared final
final class Immutable {

    // private class members
    private String name;
    private int date;

    Immutable(String name, int date) {

        // class members are initialized using constructor
        this.name = name;
        this.date = date;
    }

    // getter method returns the copy of class members
    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

}
