package com.company;

import java.util.Calendar;

public class MyCalender {

    public int getTime(){

        Calendar cal = Calendar.getInstance();
        int dayOfWeak = cal.get(Calendar.DAY_OF_WEEK);
        return dayOfWeak;
    }
}
