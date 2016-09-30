package com.hackerrank.algorithms.implementation.fairrations;

/**
 * Created by abhijeet on 30/08/16.
 * https://www.hackerrank.com/challenges/fair-rations
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int[n];
        int sum = 0;
        int count = 0;
        for (int b_i = 0; b_i < n; b_i++) {
            b[b_i] = sc.nextInt();
            sum += b[b_i];
        }
        if (sum % 2 == 1) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n; i++) {
                if (b[i] % 2 == 1) {
                    b[i] = b[i] + 1;
                    b[i + 1] = b[i + 1] + 1;
                    count += 2;
                }
            }
            System.out.println(count);
        }
    }
}

