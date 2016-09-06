package com.hackerrank.algorithms.implementation.kangaroo;

/**
 * Created by abhijeet on 21/08/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean isPossible = new Boolean(false);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if (((x2 > x1) && (v2 > v1)) || ((x2 < x1) && (v2 < v1))) {
            isPossible = false;
        } else {
            for (int i = 1; i < 10000; i++) {
                int a = x1 + i * v1;
                int b = x2 + i * v2;
                if(a == b) {
                    isPossible = true;
                    break;
                }
            }
        }
        if(isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
