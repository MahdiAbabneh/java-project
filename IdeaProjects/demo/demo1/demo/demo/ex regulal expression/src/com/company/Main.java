package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
           /*
        Write the string literal regular expression that will match the following String.
        Use the String.matches() method to verify your answer.
        */
        String challenge_1 = "I want a bike.";
        System.out.println(challenge_1.matches("I want a bike."));

         /*
        Now write a regular expression that will match "I want a bike." and "I want a ball."
        Verify your answer using the matches() method.
        */
        String challenge_2 = "I want a ball.";
        String regExp = "I want a (bike|ball).";
        System.out.println(challenge_1.matches(regExp));
        System.out.println(challenge_2.matches(regExp));

        /*
        Replace all occurrences of blank with an underscore for the following string.
        Print out the resulting string.
        */
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));

        /*
        Write a regular expression that will only match the challenge 5 string in its entirety.
        */
        String challenge6 = "aaabccccccccdddefffg";
        System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));

        /*
        Write a regular expression that will match a 5-digit US zip code.
        Use "11111" as your test string.
        */
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        /*
        US zip codes can be followed by a dash and another four numbers.
        Write a regular expression that will match those zip codes.
        Use "11111-1111" as your test string.
        */
        String challenge13 = "1-1111";
        System.out.println(challenge13.matches("^\\d?-\\d{4}$"));


    }
}
