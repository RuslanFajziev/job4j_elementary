package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int lengthLeft = left.length();
        int cycle = 0;
        int hammingsDistance = 0;
        while (cycle != lengthLeft) {
            if (left.charAt(cycle) != right.charAt(cycle)) {
                hammingsDistance++;
            }
            cycle++;
        }
        return hammingsDistance;
    }
}