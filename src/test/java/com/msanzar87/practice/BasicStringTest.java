package com.msanzar87.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStringTest {
    BasicString bs = new BasicString();
    //instantiate class into test class (class instantiated becomes object)

    @Test
    public void test1stChar(){
        char expected = 'l';

        char actual = bs.firstChar("love");

        assertEquals(expected,actual);
    }

    @Test
    public void test2ndToLastChar(){
        char expected = 's';

        char actual = bs.secondToLastChar("test");
        assertEquals(expected,actual);
    }
    @Test
    public void testContainsChar(){
        String contains = "e";

        boolean actual = bs.containsLetter("test", contains);

        assertTrue(actual);
    }
}