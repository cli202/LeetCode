package main.medium;

import java.util.Stack;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens) {
            if (Character.isDigit(token.charAt(token.length() - 1))) {
                stack.push(Integer.valueOf(token));
            } else {
                if (token.equals("+")) {
                    stack.push(stack.pop() + stack.pop());
                } else if (token.equals("*")) {
                    stack.push(stack.pop() * stack.pop());
                } else if (token.equals("-")) {
                    int one = stack.pop();
                    int two = stack.pop();
                    stack.push(two - one);
                } else if (token.equals("/")) {
                    int one = stack.pop();
                    int two = stack.pop();
                    stack.push(two / one);
                }
            }
        }
        return stack.pop();
    }
}
