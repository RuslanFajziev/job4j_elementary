package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        String txt = String.valueOf(num);
        int cycle = txt.length() -1;
        while (cycle >= 0) {
            sum += Character.getNumericValue(txt.charAt(cycle));
            cycle--;
        }
        return sum;
    }
}
