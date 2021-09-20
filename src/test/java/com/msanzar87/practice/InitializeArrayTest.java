package com.msanzar87.practice;

import com.msanzar87.practice.InitializeArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InitializeArrayTest {

    InitializeArray arr = new InitializeArray();

    @Test
    public void testInitArray1() {

        int num = 5;
        int[] actual = arr.initArr(num);
        int[] expected = {5,5,5,5,5};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testInitArray2() {


        int num = 1;
        int[] actual = arr.initArr(num);
        int[] expected = {1};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testInitArray3() {


        int num = 9;
        int[] actual = arr.initArr(num);
        int[] expected = {9,9,9,9,9,9,9,9,9};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testArray1() {

        int num = 5;
        int[] actual = arr.initArrRandom(num);
        int[] expected = {0,1,2,1,0,5};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testArray2() {

        int num = 1;
        int[] actual = arr.initArrRandom(num);
        int[] expected = {0,1};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void testArray3() {

        int num = 9;
        int[] actual = arr.initArrRandom(num);
        int[] expected = {0,1,0,1,4,3,2,1,0,9};

        assertArrayEquals(expected,actual);
    }



}