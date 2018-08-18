package com.hackerrank.challenges.tomtom.deviation;

import com.hackerrank.challenges.tomtom.linkedlistlength.Solution;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    21/07/18,
 * Time:    3:48 PM
 */
public class Deviation {
    public static void main(String[] args) {
        Deviation deviation = new Deviation();
        int[] input = {9, 4, -3, -10};
        System.out.println(deviation.findMaxDeviation(input));
    }

    private int findMaxDeviation(int[] input) {
        int length = input.length;
        int sum = 0;
        for(int i=0; i<length; i++) {
            sum+=input[i];
        }
        int avg = sum/length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<length; i++) {
            int absValue = Math.abs(avg-input[i]);
            if(max<absValue) {
                max = absValue;
                index = i;
            }
        }
        return index;
    }
}
