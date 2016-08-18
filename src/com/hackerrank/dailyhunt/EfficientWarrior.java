package com.hackerrank.dailyhunt;

import java.util.*;

/**
 * Created by abhijeet on 18/08/16.
 */
public class EfficientWarrior {
    void visit(int a[][], int i, int j, int size) {
        if(i < 0 || i >= size || j < 0 || j >= size) return;
        if(a[i][j] == 0 || a[i][j] == -1) return;
        a[i][j] = -1;
        visit(a, i+1, j, size);
        visit(a, i-1, j, size);
        visit(a, i, j+1, size);
        visit(a, i, j-1, size);
        visit(a, i+1, j+1, size);
        visit(a, i+1, j-1, size);
        visit(a, i-1, j+1, size);
        visit(a, i-1, j-1, size);
    }

    int countWarriors(int a[][], int size) {
        int count = 0;
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(a[i][j] == 1) {
                    count++;
                    visit(a, i, j, size);
                }
            }
        }
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(a[i][j] == -1) a[i][j] = 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] bitmap = new int[size][size];
        for (int i = 0; i < size; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                bitmap[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        EfficientWarrior w = new EfficientWarrior();
        System.out.println(w.countWarriors(bitmap, size));
    }
}
