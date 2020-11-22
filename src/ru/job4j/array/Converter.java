package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int lengthAll = 0;
        for (int index = 0; index < array.length; index++) {
            lengthAll += array[index].length;
        }

        int[] newArraySimle = new int[lengthAll];
        int start = 0;
        int[][] myArray = new int[0][0];
        if (lengthAll > 4 && lengthAll < 10) {
            myArray = new int[3][3];
        } else if (lengthAll > 9 && lengthAll < 17) {
            myArray = new int[4][4];
        }

        for (int index = 0; index < array.length; index++) {
            for (int index2 = 0; index2 < array[index].length; index2++) {
                newArraySimle[start++] = array[index][index2];
            }
        }
        start = 0;

        for (int index = 0; index < myArray.length; index++) {
            for (int index2 = 0; index2 < myArray[index].length; index2++) {
                if (start >= newArraySimle.length) {
                    myArray[index][index2] = 0;
                } else {
                    myArray[index][index2] = newArraySimle[start++];
                }
            }
        }
        return myArray;
    }
}