package com.hackerrank.algorithms.greedy.beautifulpairs;

/**
 * Created by abhijeet on 04/09/16.
 * https://www.hackerrank.com/challenges/beautiful-pairs
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int[] fa = new int[1001];
        int[] fb = new int[1001];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            fa[a[i]]++;
        }
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();
            fb[b[i]]++;
        }
        int k = 0;
        for (int i = 0; i < 1001; i++) {
            k += Math.min(fa[i], fb[i]);
        }
        if (k == size) {
            System.out.println(k - 1);
        } else {
            System.out.println(k + 1);
        }
    }
}
