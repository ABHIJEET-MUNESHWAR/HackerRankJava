package com.hackerrank.challenges.hackfourtyone.ariasloop;

/**
 * Created by abhijeet on 20/09/16.
 * https://www.hackerrank.com/contests/101hack41/challenges/arias-loops
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static int ans = 0;

    int nestedToRecursion(int[] counters, int[] length, int level, int k, int n, int ans) {
        if (level == counters.length) {
            return ++ans;
        } else {
            for (counters[level] = 0; counters[level] < length[level]; counters[level]++) {
                nestedToRecursion(counters, length, level + 1, k, n, ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] length = new int[k];
        int[] counters = new int[k];
        Solution sln = new Solution();
        System.out.println(sln.nestedToRecursion(counters, length, 0, k, n, ans));
    }
}
