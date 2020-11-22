package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int marker = -1;
        for (int index = 0; index < string.length; index++) {
            if (string[index] == c) {
                marker++;
                if (marker + 1 == number) {
                    marker = index;
                }
            }
        }
        return marker;
    }
}
