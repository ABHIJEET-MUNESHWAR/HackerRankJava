package com.hackerrank.challenges.tomtom.linkedlistlength;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    21/07/18,
 * Time:    3:36 PM
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {1, 4, -1, 3, 2};
        System.out.println(solution.findLength(input));
    }

    private int findLength(int[] input) {
        int length = 1;
        int ptr = input[0];
        while (true) {
            if (input[ptr] != -1) {
                ptr = input[ptr];
                length++;
            } else {
                length++;
                break;
            }
        }
        return length;
    }
}
