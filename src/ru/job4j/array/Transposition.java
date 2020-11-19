package ru.job4j.array;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int indexStol = 0; indexStol < matrix.length; indexStol++) {
            for (int indexStr = 0; indexStr < matrix[indexStol].length; indexStr++) {
                result[indexStr][indexStol] = matrix[indexStol][indexStr];
            }

        }
        return result;
    }
}
