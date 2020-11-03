package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        }
        for (int start = n; start > 0; start--) {
            result = result * start;
        }
        return result;
    }
}
