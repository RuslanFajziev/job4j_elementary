package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        int indexAbbrev = 0;
        int indexCycle = 0;
        StringBuilder builder = new StringBuilder();
        while (indexCycle != s.length()) {
            if (Character.toString(s.charAt(indexCycle)).equals(" ")) {
                indexAbbrev = indexCycle + 1;
            }
            if (indexCycle == indexAbbrev) {
                builder.append(s.charAt(indexCycle));
            }
            indexCycle++;
        }
        String textAbbrev = builder.toString();
        return textAbbrev;
    }
}