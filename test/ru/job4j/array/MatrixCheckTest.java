package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 'X');
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', '5', ' '},
                {' ', '5', '5'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, '5');
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoHorizontal3() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', '5', ' '},
                {' ', '6', '7'},
                {'6', '6', '6'},
                {'0', '0', '0'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, '6');
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 'X');
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical2() {
        char[][] input = {
                {'0', 'Y', 'Y'},
                {'5', 'Y', 'X'},
                {'2', 'Y', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 'Y');
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical3() {
        char[][] input = {
                {'0', 'Y', 'Y'},
                {'5', 'Y', 'X'},
                {'2', 'Y', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 'Z');
        assertThat(result, is(false));
    }
}