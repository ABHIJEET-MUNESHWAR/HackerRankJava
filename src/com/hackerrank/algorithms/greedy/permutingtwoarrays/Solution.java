package com.hackerrank.algorithms.greedy.permutingtwoarrays;

/**
 * Created by abhijeet on 04/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int k = sc.nextInt();
            boolean isPossible = true;
            Integer[] arr1 = new Integer[size];
            Integer[] arr2 = new Integer[size];
            for(int i=0; i<size; i++) {
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<size; i++) {
                arr2[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2, Collections.reverseOrder());
            for(int i=0; i<size; i++) {
                if((arr1[i]+arr2[i]<k)) {
                    isPossible = false;
                    break;
                }
            }
            if(isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
