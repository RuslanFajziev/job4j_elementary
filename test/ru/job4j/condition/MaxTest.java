package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMa3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5Max5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void test4() {
        int result = Max.max(1, 200, 100);
        assertThat(result, is(200));
    }

    @Test
    public void test5() {
        int result = Max.max(3, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void test6() {
        int result = Max.max(5, 500, 700, 2000);
        assertThat(result, is(2000));
    }

    @Test
    public void test7() {
        int result = Max.max(7000, 500, 700, 2000);
        assertThat(result, is(7000));
    }
}