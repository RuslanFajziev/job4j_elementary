package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] dataTemp = new int[data.length * data[0].length];
        int start = 0;
        for (int index = 0; index < data.length; index++) {
            for (int index2 = 0; index2 < data[index].length; index2++) {
                dataTemp[start++] = data[index][index2];
            }
        }
        return dataTemp;
    }
}
