package com.hackerrank.datastructures.arrays.dynamicarray;

/**
 * Created by abhijeet on 05/09/16.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSequences = sc.nextInt();
        int n = 100000;
        ArrayList<Integer>[] sequences = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            sequences[i] = new ArrayList<Integer>();
        }
        int q = sc.nextInt();
        int lastAns = 0;
        while (q-- > 0) {
            int operation = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int s = (x ^ lastAns) % totalSequences;
            if (operation == 1) {
                sequences[s].add(y);
            } else {
                int w = y % (sequences[s].size());
                lastAns = sequences[s].get(w);
                System.out.println(lastAns);
            }
        }
    }
}
