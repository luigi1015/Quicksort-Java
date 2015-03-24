import junit.framework.*;
//import static junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class QuicksortTest extends TestCase
{
	public void testSort1()
	{//General test to make sure it sorts.
		List<Integer> testInts = Arrays.asList( 5, 2, 4, 6, 1, 3 );
		Quicksort.quicksort( testInts, 0, testInts.size()-1 );
		assertTrue( testInts.get(0).intValue() == 1 );
		assertTrue( testInts.get(1).intValue() == 2 );
		assertTrue( testInts.get(2).intValue() == 3 );
		assertTrue( testInts.get(3).intValue() == 4 );
		assertTrue( testInts.get(4).intValue() == 5 );
		assertTrue( testInts.get(5).intValue() == 6 );
	}
}
