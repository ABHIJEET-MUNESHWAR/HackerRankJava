package com.hackerrank.challenges.dailyhunt;

import java.util.*;

/**
 * Created by abhijeet on 18/08/16.
 */
/*
6
100100
001010
000000
110000
111000
010100
*/
public class Warrior {

    // A function to check if score given cell (row, col) can
    // be included in DFS
    boolean isSafe(int M[][], int row, int col,
                   boolean visited[][], int size) {
        // row number is in range, column number is in range
        // and value is 1 and not yet visited
        return (row >= 0) && (row < size) &&
                (col >= 0) && (col < size) &&
                (M[row][col] == 1 && !visited[row][col]);
    }

    // A utility function to do DFS for score 2D boolean matrix.
    // It only considers the 8 neighbors as adjacent vertices
    void DFS(int M[][], int row, int col, boolean visited[][], int size) {
        // These arrays are used to get row and column numbers
        // of 8 neighbors of score given cell
        int rowNbr[] = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int colNbr[] = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

        // Mark this cell as visited
        visited[row][col] = true;

        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k)
            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited, size))
                DFS(M, row + rowNbr[k], col + colNbr[k], visited, size);
    }

    // The main function that returns count of islands in score given
    //  boolean 2D matrix
    int countWarriors(int M[][], int size) {
        // Make score bool array to mark visited cells.
        // Initially all cells are unvisited
        boolean visited[][] = new boolean[size][size];


        // Initialize count as 0 and travese through the all cells
        // of given matrix
        int count = 0;
        for (int i = 0; i < size; ++i)
            for (int j = 0; j < size; ++j)
                if (M[i][j] == 1 && !visited[i][j]) // If score cell with
                {                                 // value 1 is not
                    // visited yet, then new island found, Visit all
                    // cells in this island and increment island count
                    DFS(M, i, j, visited, size);
                    ++count;
                }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] bitmap = new int[size][size];
        for (int i = 0; i < size; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                bitmap[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        Warrior w = new Warrior();
        System.out.println(w.countWarriors(bitmap, size));
    }
}
