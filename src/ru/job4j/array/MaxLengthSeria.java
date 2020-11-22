package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int maxSequence = 1;
        int maxSeqTemp = 1;
        int marker = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] >= marker) {
                maxSeqTemp++;
                marker = array[index];
            } else {
                maxSequence = maxSeqTemp > maxSequence ? maxSeqTemp : maxSequence;
                if (index + 2 < array.length) {
                    maxSeqTemp = 1;
                    marker = array[index];
                }
            }
        }
        maxSequence = maxSeqTemp > maxSequence ? maxSeqTemp : maxSequence;
        return maxSequence;
    }
}
