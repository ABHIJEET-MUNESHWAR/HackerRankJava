package com.hackerrank.algorithms.greedy.largestpermutation;

/**
 * Created by abhijeet on 04/09/16.
 * https://www.hackerrank.com/challenges/largest-permutation
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        int[] frequency = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            frequency[arr[i]] = i;
        }
        for (int i = 0; i < size && k > 0; i++) {
            int maxValue = size - i;
            int maxIndex = frequency[size - i];
            if (maxIndex != i) {
                int t = arr[i];
                arr[i] = maxValue;
                arr[maxIndex] = t;
                frequency[maxValue] = i;
                frequency[t] = maxIndex;
                k--;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
