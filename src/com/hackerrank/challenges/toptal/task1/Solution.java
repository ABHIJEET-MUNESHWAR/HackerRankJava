package com.hackerrank.challenges.toptal.task1;

import java.util.*;

/**
 * Created by abhijeet on 24/08/16.
 */
public class Solution {
    public int fact(int num) {
        int fact = 1, i;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int combination(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }

    public int solution(int[] A) {
        int length = A.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 2) {
                ans++;
            } else if (value > 2) {
                ans += combination(value, 2);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[6];
        for (int i = 0; i < 6; i++) {
            A[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.solution(A));
    }
}
