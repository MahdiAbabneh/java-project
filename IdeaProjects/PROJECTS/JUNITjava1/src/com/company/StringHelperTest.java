package com.company;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

    StringHelper stringHelper=new StringHelper();

    @Test
    public void truncateAInFirst2Positions() {
        //StringHelper stringHelper=new StringHelper();
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
    }
    @Test
    public void truncateAInFirst2Positions2(){
       // StringHelper stringHelper=new StringHelper();
        assertEquals("ACD",stringHelper.truncateAInFirst2Positions("ACD"));

    }

    @org.junit.Test
    public void areFirstAndLastTwoCharactersTheSame() {
    }
}