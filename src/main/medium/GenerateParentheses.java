package main.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // helper(result, n, n, "");
        helper(result, n, n, new StringBuilder());
        return result;
    }

//    public void helper(List<String> result, int left, int right, String curr) {
//        if (left == 0 && right == 0) {
//            result.add(curr);
//        } else {
//            if (left == 0) {
//                helper(result, 0, right - 1, curr + ")");
//            } else if (left <= right){
//                helper(result, left - 1, right, curr + "(");
//                helper(result, left, right - 1, curr + ")");
//            }
//        }
//
//    }

    public void helper(List<String> result, int left, int right, StringBuilder curr) {
        if (left == 0 && right == 0) {
            result.add(curr.toString());
        } else {
            if (left == 0) {
                helper(result, 0, right - 1, curr.append(')'));
            } else if (left <= right){
                helper(result, left - 1, right, curr.append('('));
                curr.deleteCharAt(curr.length() - 1);
                helper(result, left, right - 1, curr.append(')'));
            }
        }

    }
}
