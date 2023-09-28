package main.medium;

import java.util.*;

/*
249. Group Shifted Strings
8/13/2023
Difficulty: Medium
Topics: Array, Hash Table, String
Understanding: almost fully
Companies: Facebook, Amazon, Google
 */

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strings) {
            StringBuilder combination = new StringBuilder();
            int prev = str.charAt(0);
            int next = 0;
            for (int i = 1; i < str.length(); i++) {
                next = str.charAt(i);
                int diff = next - prev;
                diff = (diff + 26) % 26;
                combination.append(diff);
                combination.append(',');
                prev = next;
            }
            if (map.containsKey(combination.toString())) {
                map.get(combination.toString()).add(str);
            } else {
                map.put(combination.toString(), new ArrayList<>(Arrays.asList(str)));
            }
        }
        for (String key: map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }
}
