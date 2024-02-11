package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Allan Schougaard {@literal <aschouga@sdccd.edu>}
 * @author Vanessa Tapia {@literal <vtapia001@student.sdccd.edu>}
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
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

public class M2ArrayChallenge
{
	/**
	 * Purpose: Find a given value in the array given
	 *
	 * @author Stan Strum
	 *
	 * @param array array to search
	 *
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(int[] array, int value)
	{
		for (int item : array) {
			if (value == item) {
				return true;
			}
		}

		return false;
	}

	public static int find(int[] array, int value)
	{
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}

		return -1;
	}

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
	 * @return the occurances of `value` in `array`
	 */
	public static int countValues(char[] array, char value) {
		// The amount of times `value` is found in `array`
		int count = 0;

		// For every character in `array`
		for (char ch : array) {
			// If the character matches `value` ...
			if (ch == value) {
				// Increment our occurance counter (`count`)
				count++;
			}
		}

		// Return our count
		return count;
	}

	/**
	 * Determines whether an integer array is in order from least to greatest
	 *
	 * @param array array to check
	 *
	 * @return `true` if the array is in order, `false` otherwise
	 */
	public static boolean inOrder(int[] array) {
		// Loop for all indices except last
		for (int i = 0; i < array.length - 1; i++) {
			// Get current & next value
			int currValue = array[i];
			int nextValue = array[i + 1];

			// No value shall be greater than its succcessor
			// If current value is less than the next value ...
			if (currValue > nextValue) {
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
	 * Swaps an element of an integer array with its next element
	 *
	 * @param array array to swap elements of
	 * @param index index to swap with its successor
	 *
	 * @return the array with two elements swapped
	 *
	 * @throws ArrayIndexOutOfBoundsException if called with the last index of the array because the last item has no successor
	 */
	public static int[] swap(int[] array, int index) {
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

	public static int[] bubbleUp(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int curr = array[i];
			int next = array[i + 1];

			if (curr < next) {
				continue;
			}

			swap(array, i);
		}

		return array;
	}

	public static int[] bubbleSort(int[] array) {
		while (!inOrder(array)) {
			array = bubbleUp(array);
		}

		return array;
	}

	/**
	 * it's a shallow copy because it just copies the object -- elements are part of the object
	 * but since the elements are chars, like integers they're not stored behind a reference as they
	 * would for objects.
	 *
	 * @param array array to copy
	 *
	 * @return a new copy of the array
	 */
	public static char[] copy(char[] array) {
		return array.clone();
	}

	public static boolean arrayElementsEqual(char[] array1, char[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		// could be either one, but we have to get the length somehow
		int length = array1.length;

		for (int i = 0; i < length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		return true;
	}

	public static char[] backwards(char[] array) {
		char[] new_array = new char[array.length];

		int lastIndex = array.length - 1;

		for (int i = 0; i <= lastIndex; i++) {
			new_array[i] = array[lastIndex - i];
		}

		return new_array;
	}

	public static boolean isPalindrome(char[] array) {
		return arrayElementsEqual(array, backwards(array));
	}

	public static int addRow(int[][] array, int row) {
		int sum = 0;

		for (int item : array[row]) {
			sum += item;
		}

		return sum;
	}

	public static int addColumn(int[][] array, int col) {
		int sum = 0;

		for (int[] row : array) {
			sum += row[col];
		}

		return sum;
	}

	public static int addLeftToRightDiagonal(int[][] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			assert array[i].length == array.length : "Array is not square";

			sum += array[i][i];
		}

		return sum;
	}

	public static int addRightToLeftDiagonal(int[][] array) {
		int sum = 0;
		int lastIndex = array.length - 1;

		for (int i = 0; i <= lastIndex; i++) {
			assert array[i].length == array.length : "Array is not square";

			sum += array[lastIndex - i][i];
		}

		return sum;
	}

	public static int addLastRowElement(int[][] array) {
		int sum = 0;

		for (int[] row : array) {
			sum += row[row.length - 1];
		}

		return sum;
	}
}
