package org.dmitriy.leetcode.puzzles;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < prefix.length()) {
                prefix = strs[i];
            }
        }

        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                i = -1;
            }
        }

        return prefix;
    }
}
