package main.medium;

import java.util.*;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i + 1);
            } else {
                map.putIfAbsent(nums[i], new ArrayList<>(Arrays.asList(i + 1)));
            }
        }

        for (int key: map.keySet()) {
            //int complacent = key < 0 && target < 0 ? target + key : target - key;
            int complacent = target - key;
            if (key == complacent) {
                if (map.get(key).size() > 1) {
                    result[0] = map.get(key).get(0);
                    result[1] = map.get(key).get(1);
                    return result;
                }
            }
            if (map.containsKey(complacent)) {
                result[0] = map.get(key).get(0);
                result[1] = map.get(complacent).get(0);
                Arrays.sort(result);
                return result;
            }
        }
        return result;
    }
}
