package com.hackerrank.practice.datastructure.stack;

import java.util.*;

/**
 * Created by abhijeet on 21/08/16.
 */
public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next().trim();
            Stack<Character> stk = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if(stk.isEmpty()) {
                    stk.push(input.charAt(i));
                } else {
                    switch (input.charAt(i)) {
                        case ']':
                            if (stk.peek().equals('[')) {
                                stk.pop();
                            }
                            break;
                        case '}':
                            if (stk.peek().equals('{')) {
                                stk.pop();
                            }
                            break;
                        case ')':
                            if (stk.peek().equals('(')) {
                                stk.pop();
                            }
                            break;
                        default:
                            stk.push(input.charAt(i));
                            break;
                    }
                }
            }
            System.out.println(stk.isEmpty());
        }

    }
}
