package com.hackerrank.algorithms.greedy.markandtoys;

/**
 * Created by abhijeet on 04/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totalMoney = sc.nextInt();
        int[] toys = new int[size];
        for (int i = 0; i < size; i++) {
            toys[i] = sc.nextInt();
        }
        Arrays.sort(toys);
        int pick = 0;
        for (int i = 0; i < size && totalMoney >= 0; i++) {
            totalMoney -= toys[i];
            pick++;
        }
        pick--;
        System.out.println(pick);
    }
}
