package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int index = 0; index < string.length; index++) {
            string[index] = Character.toUpperCase(string[index]);
        }
        return string;
    }
}
