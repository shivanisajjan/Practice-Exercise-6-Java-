package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FilterStringLambdaStreamTest{
    private static FilterStringLambdaStream filterStringLambdaStream;
    private static List<String> li;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        filterStringLambdaStream =new FilterStringLambdaStream();
        li=new ArrayList<>(Arrays.asList("apple","aac","banana"));

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        filterStringLambdaStream=null;

    }
    @Test
    public void testgetstring()
    {
        List<String> test1=new ArrayList<>(Arrays.asList("aac"));
        assertEquals(test1,filterStringLambdaStream.search(li));
    }
    @Test
    public void testgetstringFailure()
    {
        List<String> test2=new ArrayList<>(Arrays.asList("aac","apple"));
        assertNotEquals(test2,filterStringLambdaStream.search(li));

    }
}
