package com.hackerrank.algorithms.search.shortpalindrome;

/**
 * Created by abhijeet on 05/09/16.
 * https://www.hackerrank.com/challenges/short-palindrome
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int ans = 0;
        int mod = 1000 * 1000 * 1000 + 7;
        int[] frequency = new int[26];
        int[] cFrequency = new int[26];
        int[] pairFrequency = new int[26 * 26];
        for (char ch : str) {
            int v = ch - 'a';
            ans = (ans + cFrequency[v]) % mod;
            for (int nc = 0; nc < 26; ++nc) {  // 3-c
                cFrequency[nc] = (cFrequency[nc] + pairFrequency[nc * 26 + v]) % mod;
            }
            for (int nc = 0; nc < 26; ++nc) {  // 3-d
                int idx = nc * 26 + v;
                pairFrequency[idx] = (pairFrequency[idx] + frequency[nc]) % mod;
            }
            frequency[v]++;
        }
        System.out.println(ans);
    }
}
