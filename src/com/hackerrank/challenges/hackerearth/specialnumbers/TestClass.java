package com.hackerrank.challenges.hackerearth.specialnumbers;

/**
 * Created by abhijeet on 27/08/16.
 */

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int n = sc.nextInt();
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            for (int i = 1; i <= Math.sqrt(k); i++) {
                if (map.containsKey(i) && (i != k)) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
