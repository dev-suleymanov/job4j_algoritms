package ru.job4j.algo;

import java.util.Stack;
public class Brackets {
    public static boolean isValid(String s) {
        Stack<Character> charsStack = new Stack<>();
        char[] charsArray = s.toCharArray();
        for (char el : charsArray) {
            if (el == '(' || el == '[' || el == '{') {
                charsStack.push(el);
            } else if (el == ')' && !charsStack.isEmpty() && charsStack.peek() == '(') {
                charsStack.pop();
            } else if (el == ']' && !charsStack.isEmpty() && charsStack.peek() == '[') {
                charsStack.pop();
            } else if (el == '}' && !charsStack.isEmpty() && charsStack.peek() == '{') {
                charsStack.pop();
            } else {
                return false;
            }
        }
        return charsStack.isEmpty();
    }
}
