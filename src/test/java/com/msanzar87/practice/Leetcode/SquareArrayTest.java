package com.msanzar87.practice.Leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareArrayTest {

    SquareArray sArr = new SquareArray();

    @Test
    public void sortedSquares() {
        int[] nums = {-4,-3,0,1,2,10};
        int[] actual = sArr.sortedSquares(nums);
        int[] expected = {0,1,4,9,16,100};

        assertArrayEquals(expected,actual);

    }
    @Test
    public void sortedSquares1(){
        int[] nums1 = {0,1,5,-4,-2};
        int[] actual = sArr.sortedSquares(nums1);
        int[] expected = {0,1,4,16,25};

        assertArrayEquals(expected,actual);
    }
}