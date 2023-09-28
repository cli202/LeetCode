package main.medium;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem: 2049. Count Nodes With the Highest Score
 * Date: 8/23/2023
 * Difficulty: Medium
 * Understanding: Half
 * Topics: Array, Tree, DFS
 * Companies: Bloomberg, Visa
 */
public class CountNodesHighestScore {

    public int countHighestScoreNodes(int[] parents) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        long size = parents.length;
        Map<Integer, Long> scores = new HashMap<>();
        long max = 0;
        int count = 0;

        // build map with parent value and
        for (int i = 1; i < parents.length; i++) {
            map.putIfAbsent(parents[i], new ArrayList<>());
            map.get(parents[i]).add(i);
        }

        // use dfs to find scores
        long i = dfs(0, map, scores, size);
        System.out.println(scores);
        for (Integer key: scores.keySet()) {
            if (scores.get(key) > max) {
                max = scores.get(key);
                count = 1;
            } else if (scores.get(key) == max) {
                count++;
            }
        }
        System.out.println(max);
        return count;
    }

    public int dfs(int parent, Map<Integer, List<Integer>> map,
                   Map<Integer, Long> scores, long size) {
        // map doesn't contain key parent, this index is a leaf
        if (!map.containsKey(parent)) {
            scores.put(parent, size - 1);
            return 1;
        }
        int sum = 1;
        long prod = 1;
        // index not a leaf, has at least 1 subtree
        for (int i: map.get(parent)) {
            // num is number of nodes in subtree i
            int num = dfs(i, map, scores, size);
            sum += num;
            prod *= num;
        }
        prod = prod * Math.max(1, size - sum);
        scores.put(parent, prod);
        return sum;
    }
}
