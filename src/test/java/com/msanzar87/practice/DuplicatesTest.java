package com.msanzar87.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicatesTest {

    Duplicates ds = new Duplicates();
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {1, 2, 2, 4};
    int[] arr3 = {0, 2, 4, 4};

    @Test
    public void testDuplicateBool1(){
        boolean actual = ds.duplicateBool(arr1);

        assertFalse(actual);
    }
    @Test
    public void testDuplicateBool2(){
        boolean actual = ds.duplicateBool(arr2);

        assertTrue(actual);
    }
    @Test
    public void testDuplicateBool3(){
        boolean actual = ds.duplicateBool(arr3);

        assertTrue(actual);
    }


    @Test
    public void testDuplicateArr1(){
       int[] actual = ds.duplicateArr(arr1);

       int[] expected = {1, 2, 3, 4};

       assertArrayEquals(expected,actual);
    }
    @Test
    public void testDuplicateArr2(){
        int[] actual = ds.duplicateArr(arr2);

        int[] expected = {1, 2, 4};

        assertArrayEquals(expected,actual);
    }
    @Test
    public void testDuplicateArr3(){
        int[] actual = ds.duplicateArr(arr3);

        int[] expected = {0, 2, 4};

        assertArrayEquals(expected,actual);
    }


    @Test
    public void testDuplicateInt1(){

    }
    @Test
    public void testDuplicateInt2(){

    }
    @Test
    public void testDuplicateInt3(){

    }
}