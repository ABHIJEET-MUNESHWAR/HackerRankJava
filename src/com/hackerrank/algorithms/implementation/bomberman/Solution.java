package com.hackerrank.algorithms.implementation.bomberman;

/**
 * Created by abhijeet on 03/09/16.
 * https://www.hackerrank.com/challenges/bomber-man
 */

import java.io.*;
import java.util.*;

class Cell {
    boolean hasBomb;
    int timePlaced;

    Cell(boolean hasBomb, int timePlaced) {
        this.hasBomb = hasBomb;
        this.timePlaced = timePlaced;
    }
}

public class Solution {

    private void displayGrid(Cell[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j].hasBomb) {
                    System.out.print('O');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    private void plantBombs(Cell[][] grid, int time) {
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!grid[i][j].hasBomb) {
                    grid[i][j].hasBomb = true;
                    grid[i][j].timePlaced = time;
                }
            }
        }
    }

    private Cell[][] blowBombs(Cell[][] grid, int time) {
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((grid[i][j].hasBomb) && (grid[i][j].timePlaced == time - 3)) {
                    if (i - 1 >= 0) {
                        grid[i - 1][j].hasBomb = false;
                    }
                    if (j - 1 >= 0) {
                        grid[i][j - 1].hasBomb = false;
                    }
                    if (i + 1 < r) {
                        if (grid[i + 1][j].timePlaced != time - 3) {
                            grid[i + 1][j].hasBomb = false;
                        }
                    }
                    if (j + 1 < c) {
                        if (grid[i][j + 1].timePlaced != time - 3) {
                            grid[i][j + 1].hasBomb = false;
                        }
                    }
                    grid[i][j].hasBomb = false;
                }
            }
        }
        return grid;
    }

    public void playBomberMan(Cell[][] grid, int time) {
        if (time == 1) {
            this.displayGrid(grid);
            return;
        }
        if (time % 2 == 0) {
            this.plantBombs(grid, 2);
            this.displayGrid(grid);
            return;
        }
        if (time % 4 == 1) {
            this.plantBombs(grid, 2);
            this.blowBombs(grid, 3);
            this.plantBombs(grid, 4);
            this.blowBombs(grid, 5);
            this.displayGrid(grid);
            return;
        }
        if (time % 4 == 3) {
            this.plantBombs(grid, 2);
            this.blowBombs(grid, 3);
            this.displayGrid(grid);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int time = sc.nextInt();
        Cell[][] grid = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            String s = sc.next();
            for (int j = 0; j < cols; j++) {
                if (s.charAt(j) == 'O') {
                    grid[i][j] = new Cell(true, 0);
                } else {
                    grid[i][j] = new Cell(false, -1);
                }
            }
        }
        Solution sln = new Solution();
        sln.playBomberMan(grid, time);
    }
}

