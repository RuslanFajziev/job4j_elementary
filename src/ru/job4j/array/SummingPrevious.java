package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int index = 2; index < array.length; index++) {
            array[index] = index == 2 ? a + b : array[index - 1] * 2;
        }
        return array;
    }
}
