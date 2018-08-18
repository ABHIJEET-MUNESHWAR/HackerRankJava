package com.hackerrank.challenges.barclays.mcq.profiletest;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    29/04/18,
 * Time:    2:41 PM
 */
import java.util.*;
public class ProfileTest {
    private ProfileTest(int w) { // line 3
        System.out.println(w);
    }
    public  ProfileTest() { // line 6
        System.out.println(5);
    }
    public static void main(String args[]) {
        ProfileTest obj = new ProfileTest(10);
    }
}
