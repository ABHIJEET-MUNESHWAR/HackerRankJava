package com.hackerrank.algorithms.implementation.minimumdistances;

/**
 * Created by abhijeet on 30/08/16.
 * https://www.hackerrank.com/challenges/minimum-distances
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (map.containsKey(input)) {
                int d = Math.abs(i - map.get(input));
                if (min > d) {
                    min = d;
                }
                map.put(input, map.get(input) + 1);
            } else {
                map.put(input, i);
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
