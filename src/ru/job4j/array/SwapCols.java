package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int[][] dataTemp = new int[data.length][data[0].length];
        for (int index = 0; index < data[0].length; index++) {
            dataTemp[index][dst] = data[index][src];
            dataTemp[index][src] = data[index][dst];
        }
        for (int index = 0; index < data.length; index++) {
            for (int index2 = 0; index2 < data[index].length; index2++) {
                if (index2 == src || index2 == dst) {
                    data[index][index2] = dataTemp[index][index2];
                }
            }
        }
    }
}
