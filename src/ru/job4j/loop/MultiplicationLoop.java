package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int summ = a;
        if (a == 0 || b == 0) {
            return 0;
        }
        for (int n = a; n < b; n++) {
            summ *= (n + 1);
        }
        return summ;
    }
}
