package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int n = 0;
        while (length >= section) {
            length -= section;
            n++;
        }
        return n;
    }
}
