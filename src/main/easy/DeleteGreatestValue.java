package main.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Problem: 2500. Delete Greatest Value in Each Row
 * Date: 8/26/2023
 * Difficulty: Easy
 * Understanding: Complete
 * Topics: Array, Sorting, Heap, Matrix
 * Companies: None
 */
public class DeleteGreatestValue {
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        for (int i = grid[0].length - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max) {
                    max = grid[j][i];
                }
            }
            result += max;
        }
        return result;
    }
}
