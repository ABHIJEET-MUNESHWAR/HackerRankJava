package com.hackerrank.algorithms.dynamicprogramming.maxsubarray;

/**
 * Created by abhijeet on 05/09/16.
 * https://www.hackerrank.com/challenges/maxsubarray
 */

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;

public class Solution {

    private int maxContiguousSum(int[] arr, int size) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < size; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    private int maxNonContiguousSum(int[] arr, int size) {
        int sum = 0;
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        if (sum == 0) {
            sum = min;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Solution s = new Solution();
            System.out.print(s.maxContiguousSum(arr, size) + " ");
            System.out.println(s.maxNonContiguousSum(arr, size));
        }
    }
}
