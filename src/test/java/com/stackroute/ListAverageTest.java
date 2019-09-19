package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class ListAverageTest {
    private static ListAverage listAverage;
    private static List<Integer> li;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        li=new ArrayList<>(Arrays.asList(1,2,3,4));
        listAverage =new ListAverage();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        listAverage=null;

    }
    @Test
    public void testlistaverage()
    {
        Double exp1=new Double(2.5);
        assertEquals(exp1,listAverage.listAverage(li));

    }
    @Test
    public void testlistaverageFailure()
    {
        Double exp2=new Double(2.0);
        assertNotEquals(exp2,listAverage.listAverage(li));

    }
}
