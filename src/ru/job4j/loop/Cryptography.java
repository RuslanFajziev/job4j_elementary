package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        String phrase = "";
        int cycle = 0;
        if (s.length() == 0) {
            phrase = "empty";
        } else if (s.length() <= 4) {
            phrase = s;
        } else {
            int index = s.length() - 5;
            while (cycle != s.length()) {
                if (cycle > index) {
                    phrase += s.charAt(cycle);
                } else {
                    phrase += "#";
                }
                cycle++;
            }
        }
        return phrase;
    }
}