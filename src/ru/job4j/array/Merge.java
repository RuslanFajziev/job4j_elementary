package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int[] a = right;
        int[] b = left;
        if (left[0] < right[0]) {
            a = left;
            b = right;
        }
        for (int index = 0; index < a.length; index++) {
            rsl[index] = a[index];
        }
        int indexContinuation = a.length;
        for (int index = 0; index < b.length; index++) {
            rsl[indexContinuation++] = b[index];
        }
        return rsl;
    }
}
