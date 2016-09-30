package com.hackerrank.algorithms.graphtheory.dijkstra;

/**
 * Created by abhijeet on 13/09/16.
 */
public class ShortestPath {
    static final int vertices=9;
    private void dijkstra(int[][] graph, int src) {
        int[] dist = new int[vertices];
        Boolean[] sptSet = new Boolean[vertices];
        for(int i=0; i<vertices; i++) {
            //
        }
    }
    public static void main(String[] args) {
        int[][] graph = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }
}
