package com.hackerrank.challenges.dailyhunt;

import java.util.Scanner;

/**
 * Created by abhijeet on 18/08/16.
 */
public class MoreEfficientWarrior {

    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;

        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    count++;
                    merge(grid, i, j);
                }
            }
        }

        return count;
    }

    public void merge(char[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')
            return;

        grid[i][j]='X';

        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
        merge(grid, i+1, j+1);
        merge(grid, i+1, j-1);
        merge(grid, i-1, j+1);
        merge(grid, i-1, j-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        char[][] bitmap = new char[size][size];
        for (int i = 0; i < size; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                bitmap[i][j] = s.charAt(j);
            }
        }
        MoreEfficientWarrior w = new MoreEfficientWarrior();
        System.out.println(w.numIslands(bitmap));
    }
}
