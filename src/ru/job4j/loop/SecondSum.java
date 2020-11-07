package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int suma = 0;
        int n = a;
        while (n <= b) {
            suma += n;
            n += 2;
        }
        return suma;
    }
}
