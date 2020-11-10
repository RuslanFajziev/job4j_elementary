package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tmp = 1;
        int bakindx = 0;
        int lengthAr = array.length;
        double indxStop = Math.floor(lengthAr / 2) - 1;
        for (int index = lengthAr - 1; index > indxStop; index--) {
            tmp = array[index];
            array[index] = array[bakindx];
            array[bakindx] = tmp;
            bakindx++;
        }
        return array;
    }
}