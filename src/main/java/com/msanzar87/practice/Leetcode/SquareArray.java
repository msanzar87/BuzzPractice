package com.msanzar87.practice.Leetcode;

import java.util.Arrays;

public class SquareArray {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
