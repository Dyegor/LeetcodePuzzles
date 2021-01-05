package org.dmitriy.leetcode.puzzles;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int totalSum = nums[0];
        int tempSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            tempSum = Math.max(nums[i], tempSum + nums[i]);
            totalSum = Math.max(totalSum, tempSum);
        }
        return totalSum;
    }
}
