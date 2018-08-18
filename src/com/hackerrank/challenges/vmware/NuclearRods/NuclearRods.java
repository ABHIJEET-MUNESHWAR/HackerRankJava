package com.hackerrank.challenges.vmware.NuclearRods;

import java.util.*;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    18/08/18,
 * Time:    9:59 PM
 * https://www.careercup.com/question?id=5721734273564672
 * https://github.com/CICISUN/LeetCode/blob/master/HackerRank/NuclearRods.java
 * Find minimal cost. cost = sqrt of set size.
Input
 8
 4
 8 1
 5 8
 7 3
 8 6
Output:
 6
 */
public class NuclearRods {
    public static void main(String[] args) {
        NuclearRods nuclearRods = new NuclearRods();
        Scanner sc = new Scanner(System.in);
        int numberOfRods = Integer.parseInt(sc.nextLine());
        int pairs = Integer.parseInt(sc.nextLine());
        List<String> rodPairs = new ArrayList<>();
        for (int i = 0; i < pairs; i++) {
            rodPairs.add(sc.nextLine());
        }
        int minCost = nuclearRods.minimalCost(numberOfRods, rodPairs);
        minCost = calcCost(numberOfRods, rodPairs);
        System.out.println(minCost);
    }

    private int minimalCost(int numberOfRods, List<String> rodPairs) {
        ArrayList<Set<Integer>> sets = new ArrayList<>();
        for (String pairString : rodPairs) {
            String[] rodPairsArray = pairString.split(" ");
            int rod1 = Integer.parseInt(rodPairsArray[0]);
            int rod2 = Integer.parseInt(rodPairsArray[1]);
            boolean foundInSet = false;
            ListIterator<Set<Integer>> setListIterator = sets.listIterator();
            while (setListIterator.hasNext()) {
                Set<Integer> integerSet = setListIterator.next();
                if (integerSet.contains(rod1)) {
                    integerSet.add(rod2);
                    foundInSet = true;
                }
                if (integerSet.contains(rod2)) {
                    integerSet.add(rod1);
                    foundInSet = true;
                }
            }
            if (!foundInSet) {
                Set<Integer> integerSet = new HashSet<>();
                integerSet.add(rod1);
                integerSet.add(rod2);
                sets.add(integerSet);
            }
        }
        int totalSetSize = 0;
        int minCost = 0;
        for (Set<Integer> integerSet : sets) {
            int setSize = integerSet.size();
            totalSetSize += setSize;
            minCost += Math.ceil(Math.sqrt(setSize));
        }
        minCost += numberOfRods - totalSetSize;
        return minCost;
    }
    private static int calcCost(int numberOfRods, List<String> pairs) {
        int[] rank, parent, count;
        rank = new int[numberOfRods + 1];
        parent = new int[numberOfRods + 1];
        count = new int[numberOfRods + 1];
        for (int i = 1; i <= numberOfRods; i++) {
            parent[i] = i;
            count[i] = 1;
        }
        for (String pair : pairs) {
            String[] xy = pair.split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            union(x, y, parent, rank, count);
        }
        int res = 0;
        for (int z : count) {
            if (z > 1) {
                res += (int) Math.ceil(Math.sqrt(z));
            } else {
                res += z;
            }
        }
        return res;
    }

    private static int find(int x, int[] parent) {
        if (parent[x] != x) {
            parent[x] = find(parent[x], parent);
        }
        return parent[x];
    }

    private static void union(int x, int y, int[] parent, int[] rank,
                              int[] count) {
        int xRoot = find(x, parent), yRoot = find(y, parent);
        if (xRoot == yRoot)
            return;
        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
            count[yRoot] += count[xRoot];
            count[xRoot] = 0;
        } else if (rank[yRoot] < rank[xRoot]) {
            parent[yRoot] = xRoot;
            count[xRoot] += count[yRoot];
            count[yRoot] = 0;
        } else {
            parent[yRoot] = xRoot;
            count[xRoot] += count[yRoot];
            count[yRoot] = 0;
            rank[xRoot] = rank[xRoot] + 1;
        }
    }
}
