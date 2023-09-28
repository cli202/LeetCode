package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class SubsequenceWithLargestEvenSum {

    public long largestEvenSum(int[] nums, int k) {
    Arrays.sort(nums);
    long result = 0;
    int minOdd = Integer.MAX_VALUE;
    int minEven = Integer.MAX_VALUE;
    for (int i = nums.length - 1; i >= nums.length - k; i--) {
        result += nums[i];
        if (nums[i] % 2 == 0) {
            minEven = Math.min(minEven, nums[i]);
        } else {
            minOdd = Math.min(minOdd, nums[i]);
        }
    }
    if (result % 2 == 0) {
        return result;
    } else {
        long result1 = result - minEven;
        int newVal = findNextOdd(k, nums);
        if (newVal == -1) {
            result1 = 0;
        }
        result1 += newVal;

        long result2 = result - minOdd;
        newVal = findNextEven(k, nums);
        if (newVal == -1) {
            result2 = 0;
        }
        result2 += newVal;

        result = Math.max(result1, result2);
    }
    return result;
}

    public int findNextOdd(int k, int[] nums) {
        for (int i = nums.length - k - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public int findNextEven(int k, int[] nums) {
        for (int i = nums.length - k - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                return nums[i];
            }
        }
        return -1;
    }
}
