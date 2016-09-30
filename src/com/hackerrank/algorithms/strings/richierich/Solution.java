package com.hackerrank.algorithms.strings.richierich;

/**
 * Created by abhijeet on 03/09/16.
 * https://www.hackerrank.com/challenges/richie-rich
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
        int k = in.nextInt();
        char[] numbers = in.next().toCharArray();
        int mid = n / 2;
        boolean[] missmatch = new boolean[n];
        for (int i = 0, j = n - 1; i < mid && j >= mid; i++, j--) {
            if (numbers[i] != numbers[j]) {
                if (k == 0) {
                    System.out.println(-1);
                    return;
                }
                missmatch[i] = true;
                char c = (numbers[i] > numbers[j]) ? numbers[i] : numbers[j];
                numbers[i] = c;
                numbers[j] = c;
                k--;
            }
        }
        int i = 0;
        while ((k > 0) && (2 * i < n)) {
            if (numbers[i] == '9') {
                i++;
                continue;
            }
            if ((missmatch[i]) || (2 * i == n - 1)) {
                numbers[i] = '9';
                numbers[n - i - 1] = '9';
                k--;
            }
            if ((!missmatch[i]) && (k >= 2)) {
                numbers[i] = '9';
                numbers[n - i - 1] = '9';
                k -= 2;
            }
            i++;
        }
        System.out.println(new String(numbers));
    }
}

