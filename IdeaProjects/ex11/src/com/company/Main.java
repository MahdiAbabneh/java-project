package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println(false);
    }
    public static boolean isCatPlaying(boolean summer,int temperature) {
        if (summer != true) {
            if (temperature > 25 && temperature < 35)
                return true;
        }
        if (summer == true)
        {
            if (temperature > 25 && temperature < 45)
                return true;
        }
            return false;
    }
}
