package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int summ = a;
        int x = 1;
        while (x != n) {
            summ *= a;
            x++;
        }
        return summ;
    }
}