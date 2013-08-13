package net.hyperfloss;

import java.lang.reflect.Array;
import java.util.List;

public class Quicksort {

	List<Object> lst;
	
	private int getMedianIndex( int firstIndex, int secondIndex, int thirdIndex )
	{//Returns the index of the median value of the values at the three indexes.
		
	}
	
	private int partition( int leftIndex, int rightIndex, int pivotIndex )
	{//Sort from left to right around pivot.
		int newIndex = leftIndex;
		Object pivVal = lst.get(pivotIndex);
		Object tempVal = null;
		lst.set( pivotIndex, lst.get(rightIndex) );
		lst.set( rightIndex, pivVal );
		
		//Swap the elements around
		for( int i = leftIndex; i < rightIndex; i++ )
		{
			if( lst.get(i) < pivVal )
			{//If the element at index i is less than the pivot value, it should be before the pivot, so switch it.
				tempVal = lst.get(i);
				lst.set( i, lst.get(newIndex) );
				lst.set( newIndex, tempVal );
			}
		}
		
		//Move pivot from location right to the location it should end up.
		tempVal = lst.get(newIndex);
		lst.set( newIndex, lst.get(rightIndex) );
		lst.set( rightIndex, tempVal );
		
		return newIndex;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
