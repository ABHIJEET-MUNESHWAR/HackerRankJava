package com.hackerrank.algorithms.strings.marsexploration;

/**
 * Created by abhijeet on 03/09/16.
 * https://www.hackerrank.com/challenges/mars-exploration
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int l = S.length();
        int c = 0;
        for (int i = 0; i < l; i += 3) {
            char ch1 = S.charAt(i);
            char ch2 = S.charAt(i + 1);
            char ch3 = S.charAt(i + 2);
            if (ch1 != 'S') {
                c++;
            }
            if (ch2 != 'O') {
                c++;
            }
            if (ch3 != 'S') {
                c++;
            }
        }
        System.out.println(c);
    }
}

