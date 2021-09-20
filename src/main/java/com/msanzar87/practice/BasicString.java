package com.msanzar87.practice;

public class BasicString {
    public char firstChar(String str) {

        return str.charAt(0);
    }

    public char secondToLastChar(String str) {
        return str.charAt(str.length()-2);
    }

    public boolean containsLetter(String str, String c) {
        return str.contains(c);
    }
    // Create tests before writing the methods below in this class
    // 1. Write a method that returns the first character of a String
    //start with test class and then generate method into regular class
    // 2. Write a method that returns the second to last character of a String


    // 3. Write a method that returns a boolean value to check if the string contains a character
    // 4. Write a method that returns a boolean value to check if the string is a palindrome

}
