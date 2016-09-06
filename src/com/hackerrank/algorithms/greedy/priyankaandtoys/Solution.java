package com.hackerrank.algorithms.greedy.priyankaandtoys;

/**
 * Created by abhijeet on 04/09/16.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =  new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int c = 1;
        int initValue = arr[0];
        for(int i=0; i<size; i++) {
            if(arr[i]>(initValue+4)) {
                c++;
                initValue = arr[i];
            }
        }
        System.out.println(c);
    }
}
