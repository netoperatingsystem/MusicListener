package com.example.musiclistenerremake;

public class TimeConvertingTest {
    private int mCurrentPosition = 84;
    String totalOut = "";
    String totalNew = "";

    public TimeConvertingTest(String totalOut, String totalNew){
        this.totalOut = totalOut;
        this.totalNew = totalNew;
    }

    public String calculateTime() {
        String seconds = String.valueOf(mCurrentPosition % 60);
        String minutes = String.valueOf(mCurrentPosition / 60);
        totalOut = minutes + ":" + seconds;
        totalNew = minutes + ":" + "0" + seconds;
        if (seconds.length() == 1) {
            return totalNew;
        } else {
            return totalOut;
        }
    }
}

