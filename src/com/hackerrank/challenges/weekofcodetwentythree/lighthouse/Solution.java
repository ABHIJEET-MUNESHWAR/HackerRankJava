package com.hackerrank.challenges.weekofcodetwentythree.lighthouse;

/**
 * Created by abhijeet on 13/09/16.
 * https://www.hackerrank.com/contests/w23/challenges/lighthouse
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] grid = new int[size][size];
        for (int i = 0; i < size; i++) {
            String s = sc.next();
            for (int j = 0; j < size; j++) {
                if (s.charAt(j) == '.') {
                    grid[i][j] = 1;
                }
            }
        }
        int r = size % 2 == 0 ? size / 2 - 1 : size / 2;
        for (int z = r; z > 0; z--) {
            for (int i = z; i < size - z; i++) {
                for (int j = z; j < size - z; j++) {
                    boolean isValid = true;
                    for (int k = i - z; k <= i + z; k++) {
                        for (int l = j - z; l <= j + z; l++) {
                            if ((((i - k) * (i - k)) + ((l - j) * (l - j)) <= (z * z)) && (grid[k][l] == 0)) {
                                isValid = false;
                                break;
                            }
                        }
                        if (!isValid) {
                            break;
                        }
                    }
                    if (isValid) {
                        System.out.println(z);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }
}