package com.hackerrank.challenges.weekofcodetwentythree.unexpectedproblem;

/**
 * Created by abhijeet on 15/09/16.
 * https://www.hackerrank.com/contests/w23/challenges/commuting-strings
 */

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int m = sc.nextInt();
        String s2 = new String();
        String pattern = "^(.+?)(?=\\1*$)";
        Pattern r = Pattern.compile(pattern);
        Matcher mchr = r.matcher(s1);
        if (mchr.find( )) {
            s2 = mchr.group(0);
        }
        int l2 = s2.length();
        int mod = 1000 * 1000 * 1000 + 7;
        int ans = (int)(Math.floor(m / l2));
        ans = ans % mod;
        System.out.println(ans);
    }
}
