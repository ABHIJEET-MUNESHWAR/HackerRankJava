package com.hackerrank.challenges.hourranktwelve.repeatedstring;

/**
 * Created by abhijeet on 06/09/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long a = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        long div = n / length;
        long mod = (n % length);
        a += (div * a) - a;
        for (int i = 0; i < mod; i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        System.out.println(a);
    }
}