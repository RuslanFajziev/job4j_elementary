package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        String result = "";
        int x = 0;
        for (int index = 0; index < left.length; index++) {
            if (test(right, left[index])) {
                x = 1;
                result = Integer.toString(left[index]);
                break;
            }
        }
        if (x == 0) {
            System.out.print("");
        } else {
            System.out.println(result);
        }
    }

    public static boolean test(int[] array, int find) {
        boolean result = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == find) {
                result = true;
            }
        }
        return result;
    }
}