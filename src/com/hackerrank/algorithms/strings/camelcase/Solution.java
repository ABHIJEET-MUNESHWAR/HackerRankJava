package com.hackerrank.algorithms.strings.camelcase;

/**
 * Created by abhijeet on 03/09/16.
 * https://www.hackerrank.com/challenges/camelcase
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
        int l = s.length();
        int c = 1;
        for(int i=0; i<l; i++) {
            int v = (int)s.charAt(i);
            if(v>=65 && v<=90) {
                c++;
            }
        }
        System.out.println(c);
    }
}

