package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int lengthAr = pref.length - 1;
        for (int index = 0; index <= lengthAr; index++) {
            result = word[index] == pref[index];
            if (!result) {
                break;
            }
        }
        return result;
    }
}