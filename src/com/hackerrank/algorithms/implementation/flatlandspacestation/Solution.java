package com.hackerrank.algorithms.implementation.flatlandspacestation;

/**
 * Created by abhijeet on 30/08/16.
 * https://www.hackerrank.com/challenges/flatland-space-stations
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCities = sc.nextInt();
        int totalSpaceStations = sc.nextInt();
        Integer[] spaceStationsArray = new Integer[totalSpaceStations];
        int[] citiesArray = new int[totalCities];
        int[] dpLeft = new int[totalCities];
        int[] dpRight = new int[totalCities];
        for (int i = 0; i < totalSpaceStations; i++) {
            spaceStationsArray[i] = sc.nextInt();
        }
        Arrays.sort(spaceStationsArray);
        int max = spaceStationsArray[0];
        for (int i = 1; i < totalSpaceStations; i++) {
            int d = Math.abs((spaceStationsArray[i] - spaceStationsArray[i - 1]) / 2);
            if (max < d) {
                max = d;
            }
        }
        int dist = Math.abs(totalCities - 1 - spaceStationsArray[totalSpaceStations-1]);
        max = dist>max?dist:max;
        System.out.println(max);
    }
}
