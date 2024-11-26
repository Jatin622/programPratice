package com.programmingPratice.hacker;

public class diagonalDiff {
    public static int diagonalDifference(int[][] matrix) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        int result = diagonalDifference(matrix);
        System.out.println("The absolute difference between the diagonals is: " + result);
    }
}