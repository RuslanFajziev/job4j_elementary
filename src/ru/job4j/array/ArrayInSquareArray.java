package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int lengh = array.length;
        int start = 0;
        int[][] myArray = new int[0][0];
        if (lengh == 3 || lengh == 4) {
            myArray = new int[2][2];
        } else if (lengh > 4 || lengh <= 9) {
             myArray = new int[3][3];
        }

        for (int index = 0; index < myArray.length; index++) {
            for (int index2 = 0; index2 < myArray[index].length; index2++) {
                if (start >= array.length) {
                    myArray[index][index2] = 0;
                } else {
                    myArray[index][index2] = array[start++];
                }
            }
        }
        return myArray;
    }
}