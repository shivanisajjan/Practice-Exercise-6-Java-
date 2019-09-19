package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class UpperCaseLambdaStreamTest {
    private static UpperCaseLambdaStream upperCaseLambdaStream;
    private static List<String> li;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        upperCaseLambdaStream=new UpperCaseLambdaStream();
        li=new ArrayList<String>(Arrays.asList("a","b","abc"));

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        upperCaseLambdaStream=null;

    }
    @Test
    public void testupperCaseLambdaStream()
    {
        List<String> test1=new ArrayList<>(Arrays.asList("A","B","ABC"));
        assertEquals(test1,upperCaseLambdaStream.toUpperCase(li));

    }
    @Test
    public void testupperCaseLambdaStreamFailure()
    {
        List<String> test2=new ArrayList<>(Arrays.asList("A","B","AbC"));
        assertNotEquals(test2,upperCaseLambdaStream.toUpperCase(li));

    }
}
