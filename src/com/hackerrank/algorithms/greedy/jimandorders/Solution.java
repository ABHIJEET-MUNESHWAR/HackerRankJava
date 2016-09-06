package com.hackerrank.algorithms.greedy.jimandorders;

/**
 * Created by abhijeet on 04/09/16.
 */

import java.io.*;
import java.util.*;


class Burger implements Comparable<Burger> {
    int orderID;
    int placedAt;
    int processTime;
    int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    Burger(int orderID, int placedAt, int processTime, int totalTime) {
        this.orderID = orderID;
        this.placedAt = placedAt;
        this.processTime = processTime;
        this.totalTime = totalTime;
    }
    public int compareTo(Burger burger) {
        int compareTime = ((Burger) burger).getTotalTime();
        return this.totalTime - compareTime;
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Burger[] burgers = new Burger[t];
        for (int i = 0; i < t; i++) {
            int placedAt = sc.nextInt();
            int processTime = sc.nextInt();
            int totalTime = placedAt + processTime;
            burgers[i] = new Burger((i+1), placedAt, processTime, totalTime);
        }
        Arrays.sort(burgers);
        for(Burger b: burgers) {
            System.out.print(b.orderID + " ");
        }
    }
}
