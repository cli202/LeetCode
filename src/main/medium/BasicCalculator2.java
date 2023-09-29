package main.medium;

import java.util.Stack;

/**
 * Problem: 227. Basic Calculator II
 * Date: 9/29/2023
 * Difficulty: Medium
 * Understanding: Medium
 * Topics: Array, Stack, String
 * Companies: Facebook, Google, Microsoft
 */
public class BasicCalculator2 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int nums = 0;
        char exp = '+';
        // s = s.replaceAll("\\s", "");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {

            } else if (Character.isDigit(c)) {
                nums = nums * 10 + Character.getNumericValue(c);
            } else {
                if (exp == '-') {
                    stack.push(nums * -1);
                } else if (exp == '/') {
                    int prev = stack.pop();
                    stack.push(prev / nums);
                } else if (exp == '*') {
                    int prev = stack.pop();
                    stack.push(prev * nums);
                } else {
                    stack.push(nums);
                }
                exp = c;
                nums = 0;
            }
        }

        if (exp == '-') {
            stack.push(nums * -1);
        } else if (exp == '/') {
            int prev = stack.pop();
            stack.push(prev / nums);
        } else if (exp == '*') {
            int prev = stack.pop();
            stack.push(prev * nums);
        } else {
            stack.push(nums);
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

//    public int expression(int total, char op, int val) {
//        if (op == '+') {
//            return total + val;
//        } else if (op == '-') {
//            return total - val;
//        } else if (op == '/') {
//            return total / val;
//        } else {
//            return total * val;
//        }
//    }
}
