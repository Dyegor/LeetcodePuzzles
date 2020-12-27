package org.dmitriy.leetcode.inputReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    public static List<String> readInput() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        List<String> inputList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                break;
            }
            inputList.add(line);
        }
        return inputList;
    }
}
