package com.hackerrank.challenges.barclays.mcq.testfour;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    29/04/18,
 * Time:    3:07 PM
 */
public class Test {
    public static void main(String [] args) {
        int j = 2, y = 3, z = 10;
        for (;j < 6;j++) {
            y = (++y + z++);
            System.out.println(y+z);
        }
    }
}
