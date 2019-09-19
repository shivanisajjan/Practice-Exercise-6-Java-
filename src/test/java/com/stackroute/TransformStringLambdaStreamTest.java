package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TransformStringLambdaStreamTest {
    private static TransformStringLambdaStream transformStringLambdaStream;
    private static List<Integer> li;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        li=new ArrayList<>(Arrays.asList(2,5,6));
        transformStringLambdaStream =new TransformStringLambdaStream();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        transformStringLambdaStream=null;

    }
    @Test
    public void testgetString()
    {
        String  test1="e2,o5,e6";
        assertEquals(test1,transformStringLambdaStream.getString(li));
    }
    @Test
    public void testgetStringFailure()
    {
        String test2="e2,e5,e6";
        assertNotEquals(test2,transformStringLambdaStream.getString(li));
    }

}
