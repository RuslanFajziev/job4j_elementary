package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lengthP = post.length - 1;
        int startW = (word.length - 1) - lengthP;
        for (int i = 0; i <= lengthP; i++) {
            result = word[startW] == post[i];
            if (!result) {
                break;
            }
            startW++;
        }
        return result;
    }
}