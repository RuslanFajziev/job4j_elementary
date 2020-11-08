package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String verL = String.valueOf(i);
        String verR = "";
        int length = verL.length();
        int cycle = length - 1;
        while (cycle >= 0) {
            verR += verL.charAt(cycle);
            cycle--;
        }
        return verL.equals(verR);
    }
}