package com.example.musiclistenerremake;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class getRandomTest {

    int listSongSize = 0;

    private int getRandom(int i) {
        Random random = new Random();
        return random.nextInt(i + 1);
    }

    @Test
    public void testRandomIsEqualZero(){
        Assert.assertEquals(0, getRandom(listSongSize));
    }
}