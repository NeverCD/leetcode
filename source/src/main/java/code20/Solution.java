package main.java.code20;

import java.util.Stack;

/**
 * Created by duxf on 2017/8/7.
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (isLeft(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !_isvalid(stack.pop(), c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeft(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }

    private boolean _isvalid(char a, char b) {
        if (a == '(' && b == ')') {
            return true;
        }
        if (a == '[' && b == ']') {
            return true;
        }
        if (a == '{' && b == '}') {
            return true;
        }

        return false;
    }

    //每次压相反的进入stack
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
