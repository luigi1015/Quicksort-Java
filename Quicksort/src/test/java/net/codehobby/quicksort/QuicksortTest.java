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
     * Basic test of Quicksort's sorting using Integers.
     */
    public void testSortBasicInteger()
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

	/**
	 * Basic test of Quicksort's sorting using Integers.
	 * Uses an automatic comparison to check rather than manually specifying the values.
	 */
	public void testSortIntegerAutomatic()
	{
		ArrayList<Integer> elementsToSort = new ArrayList<Integer>();
		elementsToSort.add(3);
		elementsToSort.add(1);
		elementsToSort.add(4);
		elementsToSort.add(1);

		Quicksort.quicksort( elementsToSort );

		if( elementsToSort.size() >= 2 )
		{//If there are enough numbers to compare(at least 2), compare each number to the previous one to make sure each number is more than the previous one.
			for( int i = 1; i < elementsToSort.size(); i++ )
			{
				assertTrue( elementsToSort.get(i).compareTo(elementsToSort.get(i-1)) >= 0 );
			}
		}
	}

    /**
     * Basic test of Quicksort's sorting using Integers. This time it uses the quicksort method with the left and right parameters.
     */
    public void testSortBasicIntegerLeftRight()
    {
		ArrayList<Integer> elementsToSort = new ArrayList<Integer>();
		elementsToSort.add(3);
		elementsToSort.add(1);
		elementsToSort.add(4);
		elementsToSort.add(1);

		Quicksort.quicksort( elementsToSort, 0, 3 );

		assertTrue( elementsToSort.get(0).equals(Integer.valueOf(1)) );
		assertTrue( elementsToSort.get(1).equals(Integer.valueOf(1)) );
		assertTrue( elementsToSort.get(2).equals(Integer.valueOf(3)) );
		assertTrue( elementsToSort.get(3).equals(Integer.valueOf(4)) );
    }

    /**
     * Basic test of Quicksort's sorting using Strings.
     */
    public void testSortBasicString()
    {
		ArrayList<String> elementsToSort = new ArrayList<String>();
		elementsToSort.add("Alpha");
		elementsToSort.add("Golf");
		elementsToSort.add("Charlie");
		elementsToSort.add("Delta");

		Quicksort.quicksort( elementsToSort );

		assertTrue( elementsToSort.get(0).equals("Alpha") );
		assertTrue( elementsToSort.get(1).equals("Charlie") );
		assertTrue( elementsToSort.get(2).equals("Delta") );
		assertTrue( elementsToSort.get(3).equals("Golf") );
    }
}
