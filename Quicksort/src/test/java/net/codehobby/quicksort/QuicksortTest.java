package net.codehobby.quicksort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
	
    }
}
