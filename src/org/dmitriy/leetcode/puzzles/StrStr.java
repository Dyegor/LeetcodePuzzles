package org.dmitriy.leetcode.puzzles;

public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
