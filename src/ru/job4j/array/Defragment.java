package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int indexFull = index + 1; indexFull < array.length; indexFull++) {
                    if (array[indexFull] != null) {
                        swap(array, index, indexFull);
                        break;
                     }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        String tmp = array[nullIndex];
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = tmp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}