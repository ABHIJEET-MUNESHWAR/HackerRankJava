package com.hackerrank.algorithms.implementation.strangecounter;

/**
 * Created by abhijeet on 23/08/16.
 * https://www.hackerrank.com/challenges/strange-code
 * 3 6 12 24
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long n = 2;
        while (t > (3 * (n - 1))) {
            n *= 2;
        }
        System.out.println(3 * (n - 1) - t + 1);
    }
}