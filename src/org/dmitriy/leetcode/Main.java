package org.dmitriy.leetcode;

import org.dmitriy.leetcode.inputReader.InputReader;
import org.dmitriy.leetcode.puzzles.RomanToInteger;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> inputList = InputReader.readInput();
            for (String test: inputList) {
                RomanToInteger.romanToInt(test);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
