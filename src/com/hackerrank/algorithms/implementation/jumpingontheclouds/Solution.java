package com.hackerrank.algorithms.implementation.jumpingontheclouds;

/**
 * Created by abhijeet on 29/08/16.
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
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int energy = 100;
        int currentLocation = 0;
        for (int i = 0; i < n; i++) {
            currentLocation = (currentLocation + k) % n;
            if (c[currentLocation] == 0) {
                energy--;
            } else {
                energy -= 3;
            }
            if (currentLocation == 0) {
                break;
            }
        }
        System.out.println(energy);
    }
}

