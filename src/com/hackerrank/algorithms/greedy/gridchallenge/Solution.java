package com.hackerrank.algorithms.greedy.gridchallenge;

/**
 * Created by abhijeet on 04/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            char[][] grid = new char[size][size];
            for (int i = 0; i < size; i++) {
                grid[i] = sc.next().toCharArray();
            }
            boolean isPossible = true;
            for (int k = 0; k < size; k++) {
                Arrays.sort(grid[k]);
            }
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size; j++) {
                    if (grid[i][j] > grid[i + 1][j]) {
                        isPossible = false;
                        break;
                    }
                }
            }
            if (isPossible || size == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
