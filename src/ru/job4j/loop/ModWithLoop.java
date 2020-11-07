package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        if (n == 0) {
            return 0;
        }
        while (n != 0) {
            n -= d;
            if (n < d) {
                break;
            }
        }
        return n;
    }
}