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
                } else if (board[i][j] == row && j == board[i].length - 1) {
                    result = true;
                    stop = true;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][j] != column) {
                result = false;
                if (j < board[i].length) {
                    j++;
                }
                if (board[i][j] != column && j == board[i].length - 1) {
                    break;
                }
            } else if (board[i][j] == column && i == board.length - 1) {
                result = true;
                break;
            }
        }
        return result;
    }
}