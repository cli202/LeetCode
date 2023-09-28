package main.medium;

import java.util.*;

/**
 * Problem: 1711. Count Good Meals
 * Date: 8/27/2023
 * Difficulty: Medium
 * Understanding: Almost
 * Topics: Array, Hash Table
 * Companies: Robinhood
 */
public class CountGoodMeals {
    public int countPairs(int[] deliciousness) {
        long result = 0;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < deliciousness.length; i++) {
            int target = 1;
            long val = deliciousness[i];
            for (int j = 0; j < 22; j++) {
                if (map.containsKey(target - val)) {
                    result += map.get(target - val);
                }
                target *= 2;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return (int) (result % 1000000007);
    }
}
