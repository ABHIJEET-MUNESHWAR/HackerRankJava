package com.hackerrank.algorithms.strings.stringconstruction;

/**
 * Created by abhijeet on 03/09/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String s = in.next();
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            int l = s.length();
            for(int i=0; i<l; i++) {
                char ch = s.charAt(i);
                if(map.containsKey(ch)) {
                    map.put(String.valueOf(ch), map.get(ch)+1);
                } else {
                    map.put(String.valueOf(ch), 1);
                }
            }
            System.out.println(map.size());
        }
    }
}

