package com.programmingPratice.recursionLevel;

public class floodFill47 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        boolean[][] visited = new boolean[3][3];
        floodFill(arr, 0, 0, "", visited);
    }

    public static void floodFill(int[][] maze, int row, int col, String psf, boolean[][] visited) {

        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true) {
            return;
        }
        if (row == maze.length - 1 && col == maze.length - 1) {
            System.out.println(psf);
            return;
        }
        visited[row][col] = true;
        floodFill(maze, row - 1, col, psf + "t", visited);
        floodFill(maze, row, col - 1, psf + "l", visited);
        floodFill(maze, row + 1, col, psf + "d", visited);
        floodFill(maze, row, col + 1, psf + "r", visited);
        visited[row][col] = false;
        if (maze[row][col] == 1) {
            System.out.println("qqqq");
        }
    }
}
