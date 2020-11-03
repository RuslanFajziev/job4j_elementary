package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom15To25() {
        int rsl = Counter.sumByEven(15, 25);
        int expected = 100;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom40To60() {
        int rsl = Counter.sumByEven(40, 60);
        int expected = 550;
        assertThat(rsl, is(expected));
    }
}