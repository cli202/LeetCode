package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int l = 1;
        int r = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];
            while (l < r) {
                int complacent = nums[l] + nums[r];
                if (complacent == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                } else if (complacent < target) {
                    l++;
                } else {
                    r--;
                }
            }
            l = i + 2;
            r = nums.length - 1;
        }
        result = new ArrayList<>(new HashSet<>(result));
        return result;
    }
}
