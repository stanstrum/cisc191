package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Allan Schougaard {@literal <aschouga@sdccd.edu>}
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Other contributors:
 * N/A
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 * Version/date: 9 Feb 2024
 *
 * Responsibilities of class:
 * To implement static methods that satisfy the accompanying test suite.
 */

// See INSTRUCTIONS in TestM1Challenge

public class M1Challenge
{
	/**
	 * Adds two numbers
	 *
	 * @param a one number
	 * @param b another number
	 *
	 * @return the sum of a and b
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}

	/**
	 * Multiplies two numbers
	 *
	 * @param a one number
	 * @param b another number
	 *
	 * @return the product of a and b
	 */
	public static int multiply(int a, int b)
	{
		return a * b;
	}

	/**
	 * Returns the first element in the array given
	 *
	 * @param array to search
	 *
	 * @return the first element of the array
	 */
	public static int getFirst(int[] array)
	{
		assert array.length != 0 : "Cannot get first element of an empty array";

		return array[0];
	}

	/**
	 * Returns the last element in the array given
	 *
	 * @param array to search
	 *
	 * @return the last element of the array
	 */
	public static int getLast(int[] array)
	{
		assert array.length != 0 : "Cannot get last element of an empty array";

		int lastIndex = array.length - 1;

		return array[lastIndex];
	}

	/**
	 * Returns the middle element in an array with an odd number of elements
	 *
	 * @param array to search
	 *
	 * @return the middle element of the array
	 */
	public static int getMiddle(int[] array)
	{
		// You could do away with this assertion, however it would permit
		// the function to return dubious values
		assert array.length % 2 == 1 : "Cannot get middle element of an evenly-sized array";

		// Guaranteed to be even as `array.length` is odd
		int lastIndex = array.length - 1;

		// `lastIndex` is even, so no worry about integer division here.
		// If `array.length` is 5, then `lastIndex` is 4, and
		// the index of the middle element will be 2.
		int middleIndex = lastIndex / 2;

		return array[middleIndex];
	}

	/**
	 * Returns the smallest element in an array
	 *
	 * @param array to search
	 *
	 * @return the smallest value in the array
	 */
	public static int min(int[] array)
	{
		// Prevents OutOfBoundsException
		assert array.length != 0 : "Cannot find smallest value of an empty array";

		// Use a value from the array rather than a null Integer, zero,
		// or Integer.MIN_VALUE -- much cleaner
		int smallest = array[0];

		for (int item : array)
		{
			if (item < smallest)
			{
				smallest = item;
			}
		}

		return smallest;
	}

	/**
	 * Returns the largest element in an array
	 *
	 * @param array to search
	 *
	 * @return the largest value in the array
	 */
	public static int max(int[] array)
	{
		// Prevents OutOfBoundsException
		assert array.length != 0 : "Cannot find largest value of an empty array";

		// Use a value from the array rather than a null Integer, zero,
		// or Integer.MIN_VALUE -- much cleaner
		int largest = array[0];

		for (int item : array)
		{
			if (item > largest)
			{
				largest = item;
			}
		}

		return largest;
	}

	/**
	 * Sums an integer array
	 *
	 * @param array array to sum up
	 *
	 * @return the sum of the array
	 */
	public static int sum(int[] array)
	{
		// No length assertion needed: an empty array has a sum of zero.

		// Maybe we should use a larger data type since sum could overflow
		int sum = 0;

		for (int item : array)
		{
			sum += item;
		}

		return sum;
	}

	/**
	 * Returns the average of an array of integers
	 *
	 * @param array array to calculate average of
	 *
	 * @return the array's average
	 */
	public static float average(int[] array)
	{
		// Necessary because the array length is the dividend
		assert array.length != 0 : "Cannot find the average value of an empty array";

		float sum = sum(array);

		return sum / (float)array.length;
	}
}
