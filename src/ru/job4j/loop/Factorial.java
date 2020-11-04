package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int start = n; start > 0; start--) {
            result = result * start;
        }
        return result;
    }
}
