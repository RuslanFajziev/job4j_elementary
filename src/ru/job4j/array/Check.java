package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int lengthAr = data.length - 1;
        for (int index = 1; index <= lengthAr; index++) {
            result = data[0] == data[index];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
