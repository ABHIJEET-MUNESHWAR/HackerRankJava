package com.hackerrank.algorithms.strings.yetanotherkmp;

/**
 * Created by abhijeet on 04/09/16.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] letters = new int[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = sc.nextInt();
        }
        int min = 26;
        int minCount = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if (letters[i] > 0) {
                total++;
                if (letters[i] < minCount) {
                    min = i;
                    minCount = letters[i];
                }
            }
        }
        System.out.print((char) (min + 97));
        if (total == 1) {
            for (int i = 1; i < letters[min]; i++) {
                System.out.print((char) (min + 97));
            }
        } else if (minCount == 1) {
            for (int i = 0; i < 26; i++) {
                if (letters[i] != 0 && i != min) {
                    for (int j = 0; j < letters[i]; j++) {
                        System.out.print((char) (i + 97));
                    }
                }
            }
        } else {
            int other = -1;
            for (int i = 0; i < 26; i++) {
                if (letters[i] != 0 && i != min) {
                    other = i;
                    break;
                }
            }
            if (min < other) {
                System.out.print((char) (min + 97));
                letters[min] -= 2;
                for (int i = 0; i < 26; i++) {
                    if (letters[i] != 0 && i != min) {
                        for (int j = letters[min]; j > 0; j--) {
                            System.out.print((char) (i + 97));
                            System.out.print((char) (min + 97));
                        }
                        for (int j = 0; j < letters[i] - letters[min]; j++) {
                            System.out.print((char) (i + 97));
                        }
                        letters[min] = 0;
                    }
                }
            } else {
                letters[min]--;
                for (int i = 0; i < 26; i++) {
                    for (int j = 0; j < letters[i]; j++) {
                        System.out.print((char) (i + 97));
                    }
                }
            }
        }
    }
}