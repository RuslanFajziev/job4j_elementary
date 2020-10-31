package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square62() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square81() {
        int expected = 4;
        int p = 8;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square52() {
        int expected = 6;
        int p = 15;
        int k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}