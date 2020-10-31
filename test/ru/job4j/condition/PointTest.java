package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to10then3() {
        int expected = 3;
        int x1 = 4;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100toM50then15() {
        int expected = 15;
        int x1 = 10;
        int y1 = 0;
        int x2 = -5;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10M3toM125then15() {
        double expected = 22.09;
        int x1 = 10;
        int y1 = -3;
        int x2 = -12;
        int y2 = -5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}