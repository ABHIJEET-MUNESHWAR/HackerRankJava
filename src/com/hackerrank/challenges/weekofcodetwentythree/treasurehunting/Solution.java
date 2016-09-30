package com.hackerrank.challenges.weekofcodetwentythree.treasurehunting;

/**
 * Created by abhijeet on 14/09/16.
 * https://www.hackerrank.com/contests/w23/challenges/treasure-hunting/
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formatter kFormat = new Formatter();
        Formatter nFormat = new Formatter();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double k = (a * x + b * y) / (a * a + b * b);
        double n = (a * y - b * x) / (b * b + a * a);
        kFormat.format("%.12f", k);
        System.out.println(kFormat);
        nFormat.format("%.12f", n);
        System.out.println(nFormat);
    }
}
