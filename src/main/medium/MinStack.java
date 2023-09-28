package main.medium;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class MinStack {
    Stack<Integer> stack;
    PriorityQueue<Integer> min;
    public MinStack() {
        stack = new Stack<>();
        min = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        min.add(val);
    }

    public void pop() {
        int remove = stack.pop();
        min.remove(remove);
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
