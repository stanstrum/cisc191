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
 * 
 */

public class M2ArrayChallenge
{
	/**
	 * Purpose: Find a given value in the array given
	 * 
	 * @author Stan Strum
	 * 
	 * @param array to search
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
	
}
