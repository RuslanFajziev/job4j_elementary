package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] arrayNew = new int[left.length * left[0].length];
        int start = 0;
        for (int indexStolbec = 0; indexStolbec < left.length; indexStolbec++) {
            for (int indexStroka = 0; indexStroka < left[indexStolbec].length; indexStroka++) {
                arrayNew[start++] = left[indexStolbec][indexStroka] > right[indexStolbec][indexStroka] ? left[indexStolbec][indexStroka] : right[indexStolbec][indexStroka];
            }
        }
        return arrayNew;
    }
}