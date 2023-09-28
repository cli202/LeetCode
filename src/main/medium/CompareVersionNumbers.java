package main.medium;

/*
165. Compare Version Numbers
8/13/2023
Difficulty: Medium (easy)
Topics: Two Pointers, String
Understanding: Complete
Companies: Amazon, Apple, Oracle
 */

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = splitString(version1);
        String[] arr2 = splitString(version2);
        int index = 0;
        while (index < arr1.length && index < arr2.length) {
            int curr1 = Integer.parseInt(arr1[index]);
            int curr2 = Integer.parseInt(arr2[index]);
            if (curr1 < curr2) {
                return -1;
            } else if (curr2 < curr1) {
                return 1;
            }
            index++;
        }
        if (index < arr1.length) {
            return helper(arr1, index);
        } else if (index < arr2.length) {
            if (helper(arr2, index) == 1) {
                return -1;
            }
        }
        return 0;
    }

    public int helper(String[] arr, int index) {
        for (int i = index; i < arr.length; i++) {
            int parsed = Integer.parseInt(arr[i]);
            if (parsed != 0) {
                return 1;
            }
        }
        return 0;
    }

    public String[] splitString(String str) {
        if (str.contains(".")) {
            return str.split("\\.");
        } else {
            return new String[] {str};
        }
    }
}
