package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int l = 0, r = 0;
        for (int index = 0; index < result.length; index++) {
            if (l >= left.length) {
                result[index] = right[r++];
            } else if (r >= right.length) {
                result[index] = left[l++];
            } else if (right[r] > left[l]) {
                result[index] = left[l++];
            } else {
                result[index] = right[r++];
            }
        }
        return result;
    }
}