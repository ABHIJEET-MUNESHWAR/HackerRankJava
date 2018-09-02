package com.hackerrank.challenges.amdocs.a;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    28/08/18,
 * Time:    8:28 PM
 * 0.6 km in 5/60
 * 6/10 * 60/5
 */
public class Test {
    public void foo(){
        try{
            throw new RuntimeException();
        } finally {
            System.out.println("In finally block");
        }
    }
    public static void main(String[] args){
        int n = 0b00000000000000000000000000001111;
        System.out.println(n);
    }

    private long first(int x, int y) {
        x = x + y;
        return x;
    }
    private long second(int x, int y) {
        x +=y;
        return x;
    }
}
