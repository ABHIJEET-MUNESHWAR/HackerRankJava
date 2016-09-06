package com.hackerrank.algorithms.gametheory.gameofstones;

/**
 * Created by abhijeet on 05/09/16.
 * https://www.hackerrank.com/challenges/game-of-stones-1
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String f = "First";
        String s = "Second";
        while (t-- > 0) {
            int stones = sc.nextInt();
            if (stones % 7 < 2) {
                System.out.println(s);
            } else {
                System.out.println(f);
            }
        }
    }
}
