package com.hackerrank.practice.datastructure.negativesubarray;

import java.io.*;
import java.util.*;

/**
 * Created by abhijeet on 18/08/16.
 * https://www.hackerrank.com/challenges/java-negative-subarray
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0; i<len; i++) {
            int sum = 0;
            for (int s = i; s < len; s++) {
                sum += arr[s];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
