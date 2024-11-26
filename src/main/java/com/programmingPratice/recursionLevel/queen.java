package com.programmingPratice.recursionLevel;

public class queen {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        printNqueen(arr, "", 0);
    }
    //qsf = queen so far
    public static void printNqueen(int[][] chess, String qsf, int row) {

        if (row == chess.length) {
            System.out.println(qsf);
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (isItSafePlaceForQueen(chess, row, col) == true) {
                chess[row][col] = 1;
                printNqueen(chess, qsf + row + "_" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isItSafePlaceForQueen(int[][] chess, int row, int col) { // queen ss

        for (int i = row - 1, j = col; i >= 0; i--) { // check vertical
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) { // check right diagonal
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) { // check right diagonal
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
