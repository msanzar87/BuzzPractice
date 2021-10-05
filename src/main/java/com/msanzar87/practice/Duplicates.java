package com.msanzar87.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Duplicates {
    public boolean duplicateBool(int[] arr1) {
        boolean bool1 = false;
//
//        outerloop:
//        for (int i = 0; i < arr1.length - 1; i++) {
//            for (int j = i + 1; j < arr1.length; j++) {
//                if(arr1[i] == arr1[j]) {
//                    bool1 = true;
//                    break outerloop;
//                }
//            }
//        }

        Set<Integer> dupSet = new HashSet<>();
        //Set can only contain unique values
        //When you add a value to the Set it returns True if the value is not already in the set, False if it is.

        for (int i = 0; i < arr1.length; i++) {

            if (!dupSet.add(arr1[i])) {
                bool1 = true;
                break;
            }
        }

        return bool1;
    }

    public int[] duplicateArr(int[] arr1) {

        Set<Integer> set1 = new LinkedHashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);

        }

        int[] intArr = new int[set1.size()];
        int position = 0;

        for(int setInt : set1) {
            intArr[position++] = setInt;
        }


        return intArr;
    }

    //WRITE TESTS FIRST!!!  ADD, COMMIT, PUSH OFTEN!!!

    //Create a method that returns true or false if an int array contains a duplicate

    //Create a method that returns an int array leaving out any duplicate numbers

    //Create a method that returns an int with the number of duplicate values within an array

}
