package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int startIndx = 0;
        int lengthAr = data.length - 1;
        for (int index = lengthAr; index != startIndx; index--) {
            result = data[startIndx] == data[index];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
