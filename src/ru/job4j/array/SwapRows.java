package ru.job4j.array;

import java.util.Arrays;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[][] dataTemp = new int[data.length][data[0].length];
        for (int index = 0; index < data[0].length; index++) {
            dataTemp[dst][index] = data[src][index];
            dataTemp[src][index] = data[dst][index];
        }
        for (int index = 0; index < data.length; index++) {
            for (int index2 = 0; index2 < data[index].length; index2++) {
                data[index][index2] = dataTemp[index][index2];
            }
        }
    }
}
