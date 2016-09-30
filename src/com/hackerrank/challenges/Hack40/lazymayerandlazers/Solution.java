package com.hackerrank.challenges.Hack40.lazymayerandlazers;

import java.util.*;

/**
 * Created by abhijeet on 25/08/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBuildings = sc.nextInt();
        int[] buildingHeights = new int[totalBuildings + 1];
        for (int i = 1; i <= totalBuildings; i++) {
            buildingHeights[i] = sc.nextInt();
        }
        int totalLasers = sc.nextInt();
        long[] lasers = new long[totalLasers + 1];
        for (int i = 0; i < totalLasers; i++) {
            lasers[i] = sc.nextInt();
        }
        lasers[totalLasers] = 1L << 60;
        Arrays.sort(lasers);
        long sum = 0;
        int j = 0;
        for (int i = 1; i <= totalBuildings; i++) {
            while (lasers[j] - i <= 0) {
                j++;
            }
            sum += Math.min(lasers[j] - i, buildingHeights[i]);
        }
        System.out.println(sum);
    }
}
