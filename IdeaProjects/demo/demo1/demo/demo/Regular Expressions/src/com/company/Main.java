package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String string2 = string.replaceAll("I", "You");
        System.out.println(string2);

        String string3 = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(string3.replaceAll(".","Y"));
        System.out.println(string3.replaceAll("^abcDeee", "the beginning"));
        // ^ : Finds a match as the beginning of a string as in.
        System.out.println(string3.replaceAll("ijkl99z$", "THE END"));
        // $ : Finds a match at the end of the string as in.
        System.out.println(string3.replaceAll("[aei]", "X"));
        // [ ] :Find one character from the options between the brackets.
        System.out.println(string3.replaceAll("[^aei]", "X"));
        // [^ ]	: Find one character NOT between the brackets
        System.out.println(string3.replaceAll("[0-9]", "X"));
        // [0-9] :Find one character from the range 0 to 9
        System.out.println(string3.replaceAll("\\d", "X"));
        System.out.println(string3.replaceAll("\\D", "X"));

        String string4 = "I have blanks and\ta tab, and also a newline";
        System.out.println(string4);
        System.out.println(string4.replaceAll("\\s", ""));
        System.out.println(string4.replaceAll("\t", "X"));
        System.out.println(string4.replaceAll("\\w", "X"));
        System.out.println(string4.replaceAll("\\b", "X"));



    }
}
