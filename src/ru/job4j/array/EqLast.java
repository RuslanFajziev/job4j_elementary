package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int lengthArL = left.length - 1;
        int lengthArR = right.length - 1;
        return left[lengthArL] == right[lengthArR];
    }
}