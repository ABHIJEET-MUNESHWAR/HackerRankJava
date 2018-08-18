package com.hackerrank.challenges.thoughtworks.comparestrings;

import java.util.Scanner;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    06/05/18,
 * Time:    11:03 PM
 */
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder s1SB = new StringBuilder(s1);
        StringBuilder s2SB = new StringBuilder(s2);
//        char[] s1Ch = s1.toCharArray();
//        char[] s2Ch = s2.toCharArray();
        while (q-- > 0) {
            int i = sc.nextInt();
            i--;
//            s2Ch[i] = '1';
            s1SB.setCharAt(i, '1');
//            String s1Str = String.valueOf(s1Ch);
//            String s2Str = String.valueOf(s2Ch);
            if (s1SB.toString().compareTo(s2SB.toString()) <= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
