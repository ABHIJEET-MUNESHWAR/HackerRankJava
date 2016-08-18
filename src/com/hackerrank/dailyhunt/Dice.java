package com.hackerrank.dailyhunt;
import java.io.*;
import java.util.*;

/**
 * Created by abhijeet on 18/08/16.
 */
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int[] thr = new int[t];
        while(t-->0) {
            String s = sc.nextLine();
            int[] th = new int[s.length()];
            for(int i=0; i<s.length(); i++) {
                th[i] = Character.getNumericValue(s.charAt(i));
            }
        }
    }
}
