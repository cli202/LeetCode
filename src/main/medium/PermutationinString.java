package main.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int windowLength = s1.length();
        int[] count1 = new int[26];
        int[] count2 = new int[26];
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < windowLength; i++) {
            count1[s1.charAt(i) - 'a']++;
            // map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int l = 0, r = 0;
        while (r < s2.length()) {
            if (check(count1, count2)) {
                return true;
            }
            if (r - l == windowLength) {
                count2[s2.charAt(l) - 'a']--;
                count2[s2.charAt(r) - 'a']++;
                l++;
            } else {
                count2[s2.charAt(r) - 'a']++;
            }
            r++;
        }
        return check(count1, count2);
    }

//    public boolean check(Map<Character, Integer> map1, Map<Character, Integer> map2) {
//        for (char key: map1.keySet()) {
//            if (!map2.containsKey(key) || map2.get(key).equals(map1.get(key))) {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean check(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
