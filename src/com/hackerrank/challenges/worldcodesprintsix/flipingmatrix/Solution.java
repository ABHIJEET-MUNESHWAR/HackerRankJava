package com.hackerrank.challenges.worldcodesprintsix.flipingmatrix;

/**
 * Created by abhijeet on 28/08/16.
 * https://www.hackerrank.com/contests/world-codesprint-6/challenges/flipping-the-matrix
 */

import java.io.*;
import java.util.*;

public class Solution {
    public int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int q = sc.nextInt();
        while (q-- > 0) {
            int sum = 0;
            int quadSize = sc.nextInt();
            int matrixSize = quadSize * 2;
            int[][] matrix = new int[matrixSize][matrixSize];
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < quadSize; i++) {
                for (int j = 0; j < quadSize; j++) {
                    int ts = matrixSize - 1;
                    sum += s.max(matrix[i][j], matrix[ts - i][j], matrix[i][ts - j], matrix[ts - i][ts - j]);
                }
            }
            System.out.println(sum);
        }
    }
}
