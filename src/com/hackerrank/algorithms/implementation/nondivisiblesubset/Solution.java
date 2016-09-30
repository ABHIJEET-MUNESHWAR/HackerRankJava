package com.hackerrank.algorithms.implementation.nondivisiblesubset;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by abhijeet on 21/08/16.
 * https://www.hackerrank.com/challenges/non-divisible-subset
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] remainders = new int[n];
        int[] a = new int[n];
        int ans = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            remainders[a[a_i] % k]++;
        }
        for (int i = 0; i <= k / 2; i++) {
            if (i == 0 || (i == k / 2 && k % 2 == 0)) {
                ans += Math.min(1, remainders[i]);
            } else {
                ans += Math.max(remainders[i], remainders[k - i]);
            }
        }
        System.out.println(ans);
    }
}
