package com.hackerrank.challenges.cliquetwo.meghana;

/**
 * Created by abhijeet on 26/08/16.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int k = sc.nextInt();
            char[] gender = sc.next().toCharArray();
            int[] balloons = new int[x - 1];
            int sum = 0;
            for (int i = 0; i < x - 1; i++) {
                if (gender[i] == 'B') {
                    sum += balloons[i];
                }
            }
            if (sum < k) {
                System.out.println("Tihor is Sad :(");
            } else {
                System.out.println("Meghana is Happy :)");
            }
            sc.nextLine();
        }
    }
}
