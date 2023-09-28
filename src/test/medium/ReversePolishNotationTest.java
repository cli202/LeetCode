package test.medium;

import org.junit.Test;
import main.medium.ReversePolishNotation;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class ReversePolishNotationTest {
    @Test
    public void test1() {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        String[] tokens = new String[] {"2","1","+","3","*"};
        System.out.println(reversePolishNotation.evalRPN(tokens));
    }

    @Test
    public void test2() {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        String[] tokens = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(reversePolishNotation.evalRPN(tokens));
    }
}