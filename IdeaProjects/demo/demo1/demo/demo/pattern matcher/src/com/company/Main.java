package com.company;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*

        Hint: You'll have to compile a pattern.
        */
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        Pattern pattern = Pattern.compile("I want a (bike|ball).");
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        //--------------------------------------------------------------------

        String regex = "Mahdi";
        Pattern pattern1 = Pattern.compile(regex);
        // Get the String to be matched
        String string = "MahdiForMahdi";
        // Create a matcher for the input String
        Matcher matcher1 = pattern.matcher(string);
        // Get the subsequence
        // using find() method
        System.out.println(matcher1.find());









    }
}
