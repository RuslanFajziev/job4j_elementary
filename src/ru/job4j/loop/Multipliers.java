package ru.job4j.loop;

public class Multipliers {
    public static void out(int n) {
        int del = 1;
        while (del <= n) {
            if (n % del == 0) {
                System.out.println(del);
            }
            del++;
        }
    }
}
