package com.hackerrank.challenges.weekofcodetwentythree.gearsofwar;

/**
 * Created by abhijeet on 12/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int g = sc.nextInt();
            if (g % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}