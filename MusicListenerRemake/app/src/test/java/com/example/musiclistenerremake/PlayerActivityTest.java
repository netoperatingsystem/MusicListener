package com.example.musiclistenerremake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerActivityTest {

    private TimeConvertingTest timetime;
    String expectedValue = "";

    @Before
    public void init(){
        timetime= new TimeConvertingTest("", "");
    }

    @Test
    public void testFormattedTime(){
        String expectedValue = "1:24";
        assertEquals("Time calculating is correct", expectedValue, timetime.calculateTime());
    }

}