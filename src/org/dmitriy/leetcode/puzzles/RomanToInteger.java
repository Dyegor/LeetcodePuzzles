package org.dmitriy.leetcode.puzzles;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentDigit = romanToValue(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextDigit = romanToValue(s.charAt(i + 1));
                if (currentDigit < nextDigit) {
                    currentDigit = nextDigit - currentDigit;
                    i++;
                }
            }
            result += currentDigit;
        }
        return result;
    }

    private static int romanToValue(char c) {
        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
