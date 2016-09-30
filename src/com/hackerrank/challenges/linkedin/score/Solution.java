package com.hackerrank.challenges.linkedin.score;

/**
 * Created by abhijeet on 18/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<String, Integer> map = new HashMap<>();
        int l = s.length();
        int sum = 0;
        for (int i = 0; i < l; i++) {
            String ch = String.valueOf(s.charAt(i));
            if (map.containsKey(ch)) {
                map.put(String.valueOf(ch), map.get(ch) + 1);
            } else {
                map.put(String.valueOf(ch), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String ch = entry.getKey();
            if ((ch.equals("lecturenotes")) || (ch.equals("e")) || (ch.equals("i")) || (ch.equals("o")) || (ch.equals("u"))) {
                sum++;
            } else {
                sum += 2;
            }
        }
        System.out.println(sum);
    }
}