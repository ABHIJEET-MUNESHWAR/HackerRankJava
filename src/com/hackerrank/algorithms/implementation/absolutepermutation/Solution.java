package com.hackerrank.algorithms.implementation.absolutepermutation;

/**
 * Created by abhijeet on 01/09/16.
 * https://www.hackerrank.com/challenges/absolute-permutation
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (k == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print((i + 1) + " ");
                }
            } else {
                if (n % k != 0 && n > 0) {
                    System.out.print(-1);
                } else {
                    int ub = 2 * k;
                    for (int i = ub; i <= n; i = ub + 2 * k) {
                        ub = i;
                        int mb = ub - k + 1;
                        int lb = ub - 2 * k + 1;
                        for (int j = mb; j <= ub; j++) {
                            System.out.print(j + " ");
                        }
                        for (int j = lb; j < mb; j++) {
                            System.out.print(j + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

