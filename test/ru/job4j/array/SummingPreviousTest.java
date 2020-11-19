package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviousTest {

    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, SummingPrevious.calculate(1, 2, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] {1, 2, 3, 6}, SummingPrevious.calculate(1, 2, 4));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, SummingPrevious.calculate(1, 2, 5));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] {5, 2, 7, 14, 28, 56, 112}, SummingPrevious.calculate(5, 2, 7));
    }

}