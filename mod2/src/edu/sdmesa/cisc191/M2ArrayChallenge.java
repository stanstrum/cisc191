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

	public static boolean inOrder(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int last = array[i - 1];
			int curr = array[i];

			if (last > curr) {
				return false;
			}
		}

		return true;
	}

	public static int[] swap(int[] array, int index) {
		int currIndex = index;
		int nextIndex = index + 1;

		int temp = array[currIndex];

		array[currIndex] = array[nextIndex];
		array[nextIndex] = temp;

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
