package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        boolean stop = false;
        for (int i = 0; i < board.length; i++) {
            if (stop) {
                break;
            }
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != row) {
                    result = false;
                    break;
                } else if (board[i][board[i].length - 1] == row && j == board[i].length - 1) {
                    result = true;
                    stop = true;
                }
            }
        }
        return result;
    }
}