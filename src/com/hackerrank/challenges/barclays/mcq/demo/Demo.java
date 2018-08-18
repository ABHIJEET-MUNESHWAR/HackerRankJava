package com.hackerrank.challenges.barclays.mcq.demo;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    29/04/18,
 * Time:    2:34 PM
 */
class Demo{
    public static void main(String args[])
    {
        byte a[] = { 65, 66, 67, 68, 69, 70 };
        byte b[] = { 71, 72, 73, 74, 75, 76 };
        System.arraycopy(a, 2, b, 1, a.length-3);
        System.out.print(new String(a) + " " + new String(b));
    }
}