package com.hackerrank.challenges.hackfourtyone.lecturenotes;

/**
 * Created by abhijeet on 20/09/16.
 * https://www.hackerrank.com/contests/101hack41/challenges/lecture-notes
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
        int k = in.nextInt();
        String s = in.next();
        boolean isPossible = false;
        int friends[] = new int[k];
        for (int friends_i = 0; friends_i < k; friends_i++) {
            friends[friends_i] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
            int index = friends[i] - 1;
            if (s.charAt(index) == '0') {
                isPossible = true;
                break;
            }
        }
        if (isPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

