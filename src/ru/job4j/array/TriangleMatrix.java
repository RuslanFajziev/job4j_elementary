package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int start = 1;
        for (int index = 0; index < count; index++) {
            triangle[index] = new int[index + 1];
        }
        for (int index = 0; index < triangle.length; index++) {
            for (int indexSecond = 0; indexSecond < triangle[index].length; indexSecond++) {
                triangle[index][indexSecond] = start++;
            }
        }
        return triangle;
    }
}
