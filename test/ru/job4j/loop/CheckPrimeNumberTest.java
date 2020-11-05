package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(true));
    }

    @Test
    public void when8() {
        boolean rsl = CheckPrimeNumber.check(8);
        assertThat(rsl, is(false));
    }

    @Test
    public void when7() {
        boolean rsl = CheckPrimeNumber.check(7);
        assertThat(rsl, is(true));
    }

    @Test
    public void when19() {
        boolean rsl = CheckPrimeNumber.check(19);
        assertThat(rsl, is(true));
    }

    @Test
    public void when173() {
        boolean rsl = CheckPrimeNumber.check(173);
        assertThat(rsl, is(true));
    }

    @Test
    public void when174() {
        boolean rsl = CheckPrimeNumber.check(174);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1483() {
        boolean rsl = CheckPrimeNumber.check(1483);
        assertThat(rsl, is(true));
    }

    @Test
    public void when1484() {
        boolean rsl = CheckPrimeNumber.check(1484);
        assertThat(rsl, is(false));
    }

    @Test
    public void when9() {
        boolean rsl = CheckPrimeNumber.check(9);
        assertThat(rsl, is(false));
    }
}