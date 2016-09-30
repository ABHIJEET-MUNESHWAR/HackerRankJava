package com.hackerrank.challenges.hackfourtyone.washingplates;

/**
 * Created by abhijeet on 20/09/16.
 * https://www.hackerrank.com/contests/101hack41/challenges/washing-plates
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] p = new long[n];
        long[] d = new long[n];
        long sum = 0;
        long[] diff = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextLong();
            d[i] = sc.nextLong();
            sum -= d[i];
            diff[i] = p[i] + d[i];
        }
        Arrays.sort(diff);
        for (int i = 0; i < k && i < n; i++) {
            sum += diff[n - i - 1];
        }
        System.out.println(sum > 0 ? sum : 0l);
    }
}
