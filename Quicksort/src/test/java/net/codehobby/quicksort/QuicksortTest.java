package net.codehobby.quicksort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Unit test for the Quicksort App.
 */
public class QuicksortTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName Name of the test case
     */
    public QuicksortTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( QuicksortTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Basic test of Quicksort's sorting.
     */
    public void testSort()
    {
		ArrayList<Integer> elementsToSort = new ArrayList<Integer>();
		elementsToSort.add(3);
		elementsToSort.add(1);
		elementsToSort.add(4);
		elementsToSort.add(1);

		Quicksort.quicksort( elementsToSort );

		assertTrue( elementsToSort.get(0).equals(Integer.valueOf(1)) );
		assertTrue( elementsToSort.get(1).equals(Integer.valueOf(1)) );
		assertTrue( elementsToSort.get(2).equals(Integer.valueOf(3)) );
		assertTrue( elementsToSort.get(3).equals(Integer.valueOf(4)) );
    }
}
