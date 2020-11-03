package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(expected));
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }

    @Test
    public void whenCalculateFactorialFor1Then1() {
        int expected = 1;
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialFor10Then3628800() {
        int expected = 3628800;
        int rsl = Factorial.calc(10);
        assertThat(rsl, is(expected));
    }
}