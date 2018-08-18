package com.hackerrank.challenges.thoughtworks.digitsinnumber;

import java.util.Scanner;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    06/05/18,
 * Time:    10:45 PM
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            printNumbers(n);
        }
    }

    private static void printNumbers(long n) {
        // Finding the length of n-th number
        long len = 1;

        // Count of numbers with len-1 digits
        long prev_count = 0;
        while (true) {
            // Count of numbers with i digits
            long curr_count = (long) (prev_count + Math.pow(3, len));

            // if i is the length of such number
            // then n<4*(4^(i-1)-1)/3 and n>= 4*(4 ^ i-1)/3
            // if a valid i is found break the loop
            if (prev_count < n && curr_count >= n)
                break;

            // check for i + 1
            len++;

            prev_count = curr_count;
        }

        // Till now we have covered 'prev_count' numbers
        int ans = 0;
        // Finding ith digit at ith place
        for (int i = 1; i <= len; i++) {
            // j = 1 means 2 j = 2 means ...j = 4 means 7
            for (long j = 1; j <= 3; j++) {
                // if prev_count + 4 ^ (len-i) is less
                // than n, increase prev_count by 4^(x-i)
                if (prev_count + Math.pow(3, len - i) < n)
                    prev_count += Math.pow(3, len - i);

                    // else print the ith digit and break
                else {
                    if (j == 1)
                        ans++;
//                        System.out.print("1");
                    else if (j == 2)
                        ans++;
//                        System.out.print("2");
                    else if (j == 3)
                        ans++;
//                        System.out.print("3");
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
