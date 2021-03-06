package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstdMax() {
        int result = MultiMax.max(78, 4, 2);
        assertThat(result, is(78));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(55, 55, 55);
        assertThat(result, is(55));
    }
}