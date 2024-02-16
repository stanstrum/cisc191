package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 *
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 * @author Vanessa Tapia {@literal <vtapia001@student.sdccd.edu>}
 *
 * Other contributors:
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 * Version/date: 9 Feb 2024
 *
 * Responsibilities of class:
 * To implement methods that satisfy the challenge tests.
 */
public class M2ArrayChallenge {
	/**
	 * Whether a given value is in an array
	 *
	 * @param array array to search
	 * @param value value to search for
	 *
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(int[] array, int value)
	{
		// For every item in the array
		for (int item : array)
		{
			// If the item is the value we're searching for
			if (value == item)
			{
				return true;
			}
		}

		// We never returned in the loop, which means we never found
		// the provided value in the array, therefore return false
		return false;
	}

	/**
	 * Finds the index of a given value in an array
	 *
	 * @param array array to search
	 * @param value value to search for
	 *
	 * @return the index of the value if found, otherwise {@code -1}
	 */
	public static int find(int[] array, int value)
	{
		// For every item in the array
		for (int i = 0; i < array.length; i++)
		{
			// If the item is the value we're looking for
			if (array[i] == value)
			{
				// Return the value's index in the array
				return i;
			}
		}

		// We never found the value, so return -1
		return -1;
	}

	/**
	 * Gets the value of an element in a two-dimensional array
	 *
	 * @param data   two-dimensional array to get element from
	 * @param row    row of the element
	 * @param column column of the element
	 *
	 * @return the value of the element at {@code row} and {@code column} in the
	 *         array
	 */
	public static int getElement(int[][] data, int row, int column)
	{
		return data[row][column];
	}

	/**
	 * Count the occurances of a specific character in an array
	 *
	 * @param array array of chars to search
	 * @param value value to search for
	 *
	 * @return the occurances of {@code value} in {@code array}
	 */
	public static int countValues(char[] array, char value)
	{
		// The amount of times `value` is found in `array`
		int count = 0;

		// For every character in `array`
		for (char ch : array)
		{
			// If the character matches `value` ...
			if (ch == value)
			{
				// Increment our occurance counter `count`
				count++;
			}
		}

		// Return our count
		return count;
	}

	/**
	 * Swaps an element of an integer array with its next element
	 *
	 * @param array array to swap elements of
	 * @param index index to swap with its successor
	 *
	 * @return the array with two elements swapped
	 *
	 * @throws ArrayIndexOutOfBoundsException if called with the last index of the
	 *                                        array because the last item has no
	 *                                        successor
	 */
	public static int[] swap(int[] array, int index)
	{
		// Assign names to indices for clarity
		int currIndex = index;
		int nextIndex = index + 1;

		// Save the current value
		int temp = array[currIndex];

		// Overwrite the current value with the next value
		array[currIndex] = array[nextIndex];

		// Write the current value to the next index
		array[nextIndex] = temp;

		// Return the modified array
		return array;
	}

	/**
	 * Determines whether an integer array is in order from least to greatest
	 *
	 * @param array array to check
	 *
	 * @return {@code true} if the array is in order, {@code false} otherwise
	 */
	public static boolean inOrder(int[] array)
	{
		// Loop for all indices except last
		for (int i = 0; i < array.length - 1; i++)
		{
			// Get current & next value
			int currValue = array[i];
			int nextValue = array[i + 1];

			// No value shall be greater than its succcessor
			// If current value is less than the next value ...
			if (currValue > nextValue)
			{
				// Indicate that the array is not in order
				return false;
			}

			// Continue checking
		}

		// If we made this far, then all of the items in the loop
		// are less than its successors, therefore the array
		// is in order
		return true;
	}

	/**
	 * Checks from left to right in an array for an element that is larger than the
	 * value
	 * that appears after it. If found, it swaps their values in the array.
	 *
	 * @param array array to "bubble up" values
	 *
	 * @return the array, having been bubbled-up
	 */
	public static int[] bubbleUp(int[] array)
	{
		// For every index but the last, as we need to compare each item with the next
		for (int i = 0; i < array.length - 1; i++)
		{
			// Get the values of the current & next values
			int curr = array[i];
			int next = array[i + 1];

			// If the current value is out of order, i.e. larger than the next element
			if (curr > next)
			{
				// Swap this element with the next
				swap(array, i);
			}
		}

		// Return the bubbled-up array
		return array;
	}

	/**
	 * Bubble-sort an array
	 *
	 * @param array array to sort
	 *
	 * @return the sorted array
	 */
	public static int[] bubbleSort(int[] array)
	{
		// While the array isn't sorted
		while (!inOrder(array))
		{
			// Bubble up elements from left to right, smallest to largest
			array = bubbleUp(array);
		}

		// Return the sorted array
		return array;
	}

	/**
	 * Copies a char array. This is a shallow copy of the array, as we are making
	 * a reference to a new copy of the array's values, which are stored in standard-width
	 * cells. As {@code char} is a primitive type (that fits in pointer width), a
	 * byte-copy of the element copies the value as it is not a reference itself.
	 *
	 * @param array array to copy
	 *
	 * @return a new copy of the array
	 *
	 * @see {@link Object#clone}
	 */
	public static char[] copy(char[] array)
	{
		return array.clone();
	}

	/**
	 * Checks whether two arrays contain equivalent data
	 *
	 * @param array1 first array
	 * @param array2 second array
	 *
	 * @return {@code true} if every element is present in both arrays, otherwise
	 *         {@code false}
	 */
	public static boolean arrayElementsEqual(char[] array1, char[] array2)
	{
		// Two arrays cannot be equal if they have different lengths
		if (array1.length != array2.length)
		{
			return false;
		}

		// Both arrays have the same length, this is the length of both arrays
		int length = array1.length;

		// For every index in the arrays
		for (int i = 0; i < length; i++)
		{
			// If the values differ, return false
			if (array1[i] != array2[i])
			{
				return false;
			}
		}

		// The arrays contain the same values, return true
		return true;
	}

	/**
	 * Reverse an array
	 *
	 * @param array array to reverse
	 *
	 * @return the reversed array
	 */
	public static char[] backwards(final char[] array)
	{
		// Make a new array for the reverse array as modifying the input
		// is not allowed
		char[] newArray = new char[array.length];

		// Find the last index so we can insert elements backwards
		int lastIndex = array.length - 1;

		// Loop through all indices
		for (int i = 0; i <= lastIndex; i++)
		{
			// Insert element into newArray backwards
			newArray[i] = array[lastIndex - i];
		}

		return newArray;
	}

	/**
	 * Checks whether a {@code char} array represents a palindromic string,
	 * i.e. a string that reads identically both backwards and forwards
	 *
	 * @param array array to check
	 *
	 * @return {@code true} if the text is palindromic, else {@code false}
	 */
	public static boolean isPalindrome(char[] array)
	{
		// Return whether the array contains the same elements as itself when reversed
		return arrayElementsEqual(array, backwards(array));
	}

	/**
	 * Adds a row of numbers from a two-dimensional array
	 *
	 * @param array array of values
	 * @param row   index of row of values to sum
	 *
	 * @return the sum of the row's values
	 */
	public static int addRow(int[][] array, int row)
	{
		// Make a counter for the sum
		int sum = 0;

		// For every item in the row corresponding to the index `row` ...
		for (int item : array[row])
		{
			// Add each item
			sum += item;
		}

		// Return the sum of the row
		return sum;
	}

	/**
	 * Adds a column of numbers from a two-dimensional array
	 *
	 * @param array array of values
	 * @param row   index of column of values to sum
	 *
	 * @return the sum of the column's values
	 */
	public static int addColumn(int[][] array, int col)
	{
		// Make a counter for the sum
		int sum = 0;

		// For every row in the array ...
		for (int[] row : array)
		{
			// Add each value at the specified column `col`
			sum += row[col];
		}

		// Return the sum of the columns
		return sum;
	}

	/**
	 * Adds the values along the top-left to bottom-right diagonal in the provided
	 * 2D array
	 *
	 * @param array array of values to calculate diagnal sum of
	 *
	 * @return the sum of the diagonal values
	 */
	public static int addLeftToRightDiagonal(int[][] array)
	{
		int sum = 0;

		// For every row index in the array ...
		for (int i = 0; i < array.length; i++)
		{
			// Add each value on the diagonal to the sum
			sum += array[i][i];
		}

		return sum;
	}

	/**
	 * Adds the values along the bottom-left to top-right diagonal in the provided
	 * 2D array
	 *
	 * @param array array of values to calculate diagnal sum of
	 *
	 * @return the sum of the diagonal values
	 */
	public static int addRightToLeftDiagonal(int[][] array)
	{
		int sum = 0;

		// Calculate last row index to iterate from the bottom row to the top
		int lastIndex = array.length - 1;

		// For every row index
		for (int i = 0; i <= lastIndex; i++)
		{
			// Add the item on the bottom-left to top-right diagonal
			sum += array[lastIndex - i][i];
		}

		return sum;
	}

	/**
	 * Adds the last element of every row in an array
	 *
	 * @param array 2D array
	 *
	 * @return sum of the last elements in the array
	 */
	public static int addLastRowElement(int[][] array)
	{
		int sum = 0;

		// For every row ...
		for (int[] row : array)
		{
			// Add the value of the last item to our sum
			sum += row[row.length - 1];
		}

		return sum;
	}
}
