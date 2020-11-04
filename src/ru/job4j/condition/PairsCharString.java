package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String left, String right) {
        return left.length() == 0 && right.length() == 0 ? true : left.charAt(0) == right.charAt(right.length() - 1) && left.charAt(left.length() - 1) == right.charAt(0);
    }
}