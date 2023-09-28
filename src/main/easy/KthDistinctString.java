package main.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Problem: 2053. Kth Distinct String in an Array
 * Date: 8/27/2023
 * Difficulty: Easy
 * Understanding: Complete
 * Topics: Array, Hash Table, String, Counting
 * Companies: Amazon
 */
public class KthDistinctString {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int distinct = 1;
        for (String key: map.keySet()) {
            if (map.get(key) == 1) {
                if (distinct == k) {
                    return key;
                } else {
                    distinct++;
                }
            }
        }
        return "";
    }
}
