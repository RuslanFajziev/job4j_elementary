package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean status = false;
        for (int i = 0; i < array.length - 1; i++) {
            status = array[i] < array[i + 1] ? true : false;
        }
        return status;
    }
}
