package main.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Problem: 2598. Smallest Missing Non-negative Integer After Operations
 * Date: 8/27/2023
 * Difficulty: Medium
 * Understanding: Almost
 * Topics: Array, Hash Table, Math
 * Companies: Atlassian, Mercari
 */
public class SmallestMissingInt {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num;
            if (nums[i] >= 0) {
                num = nums[i] % value;
            } else {
                int mod = nums[i] % (value - 2 * value);
                num = mod == 0 ? 0 : mod + value;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i <= 100000; i++) {
            if (!map.containsKey(i % value)) {
                return i;
            } else {
                int newFreq = map.get(i % value);
                if (newFreq == 1) {
                    map.remove(i % value);
                } else {
                    map.put(i % value, newFreq - 1);
                }
            }
        }
        return 100000;
    }
}
