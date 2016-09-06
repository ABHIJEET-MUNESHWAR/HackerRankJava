package com.hackerrank.algorithms.implementation.beautifultriplets;

/**
 * Created by abhijeet on 31/08/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int count = 0;
        for (Integer i : arr) {
            if (arr.contains(i + d) && arr.contains(i + 2 * d)) {
                count++;
            }
        }
        System.out.println(count);
    }
}