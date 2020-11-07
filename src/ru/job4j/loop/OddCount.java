package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int suma = 0;
        int n = a;
        while (n <= b) {
            if (n % 2 != 0) {
                suma += 1;
            }
            n++;
        }
        return suma;
    }
}
