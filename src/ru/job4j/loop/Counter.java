package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int startNEW = start; startNEW <= finish; startNEW++) {
            sum = sum + startNEW;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int startNEW = start; startNEW <= finish; startNEW++) {
            sum = startNEW % 2 == 0 ? sum + startNEW : sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(5, 7));
        System.out.println(sum(10, 15));
    }
}
