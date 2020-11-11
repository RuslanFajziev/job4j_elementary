package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tmp = 1;
        int lengthAr = array.length;
        int bakindx = lengthAr - 1;
        double indxStop = Math.floor(lengthAr / 2) - 1;
        for (int index = 0; index <= indxStop; index++) {
            tmp = array[index];
            array[index] = array[bakindx];
            array[bakindx] = tmp;
            bakindx--;
        }
        return array;
    }
}