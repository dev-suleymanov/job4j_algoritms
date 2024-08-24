package ru.job4j.algo;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static String longestUniqueSubstring(String str) {
        char[] charsArray = str.toCharArray();
        Set<Character> charSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char el : charsArray) {
            charSet.add(el);
        }
        if (charSet.size() == 1) {
            stringBuilder.append(charsArray[0]);
        } else {
            int size = 0;
            charSet.clear();
            while (size < charsArray.length) {
                charSet.add(charsArray[size]);
                if (charSet.size() == size) {
                    size--;
                    charSet.clear();
                }
                size++;
            }
            charSet.stream().forEach(stringBuilder::append);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "abcbcde";
        String result = longestUniqueSubstring(str);
        System.out.println(result);
    }
}