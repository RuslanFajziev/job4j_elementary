package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int varMax = first >= second ? first : second;
        return varMax >= third ? varMax : third;
    }
}
