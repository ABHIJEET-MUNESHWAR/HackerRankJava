package com.hackerrank.challenges.linkedin.reputation;

/**
 * Created by abhijeet on 18/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    private int maxReputation(int[] s_boys, int[] s_girls, int m) {
        int r = 0;
        int boys = s_boys.length;
        int girls = s_girls.length;
        int[] res = new int[boys];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < boys; i++) {
            res[i] = s_boys[i] * s_girls[i];
            r += res[i];
            if (max < s_boys[i]) {
                max = s_boys[i];
            }
            if (max < s_girls[i]) {
                max = s_girls[i];
            }
        }
        for (int i = 0; i < m; i++) {
            r += max;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res;

        int _s_boys_size = 0;
        _s_boys_size = sc.nextInt();
        int[] _s_boys = new int[_s_boys_size];
        int _s_boys_item;
        for (int _s_boys_i = 0; _s_boys_i < _s_boys_size; _s_boys_i++) {
            _s_boys_item = sc.nextInt();
            _s_boys[_s_boys_i] = _s_boys_item;
        }

        int _s_girls_size = 0;
        _s_girls_size = sc.nextInt();
        int[] _s_girls = new int[_s_girls_size];
        int _s_girls_item;
        for (int _s_girls_i = 0; _s_girls_i < _s_girls_size; _s_girls_i++) {
            _s_girls_item = sc.nextInt();
            _s_girls[_s_girls_i] = _s_girls_item;
        }

        int _m;
        _m = sc.nextInt();
        Solution sln = new Solution();
        res = sln.maxReputation(_s_boys, _s_girls, _m);
        System.out.println(res);
    }
}
