package com.hackerrank.practice.datastructure.onedarray;

import java.util.*;

/**
 * Created by abhijeet on 18/08/16.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int len = sc.nextInt();
            int jump = sc.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextInt();
            }
            int k = 0;
            if (jump == 0 || jump == 1) {
                System.out.println("NO");
            } else {
                while (true) {
                    if (k == len || k > len) {
                        System.out.println("YES");
                        break;
                    }
                    if ((arr[k] == 0) && ((k + 1) < len) && (arr[k + 1] == 0)) {
                        k++;
                    }
                    if ((arr[k] == 0) && ((k + 1) < len) && (arr[k + 1] == 1)) {
                        if((k+jump<len) && (arr[k+jump] == 0)) {
                            k+=jump;
                        } else {
                            System.out.println("NO");
                            break;
                        }
                    }
                }
            }
        }
    }
}