package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Other contributors:
 * N/A
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 * Version/date: 19 Feb 2024
 *
 * Responsibilities of class:
 */
public abstract class Cycle implements Movable
{
	// A cycle has a unique frame number, that is *immutable*;
	// How are you going to make it immutable, so that it only gets one final number?
	// (Hint: did you see the hint?)
	private int frameNumber;

	// A cycle has a make, that is immutable
	public Cycle(String newMake)
	{
	}

	abstract int getNumberOfWheels();

	/**
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 *
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake()
	{
		return null;
	}

	/**
	 * @return the unique serial number that was stamped in the frame when the bike was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	public int getFrameNumber()
	{
		return -1;
	}

	/**
	 * @return true if the frame number are the same
	 */
	@Override
	public boolean equals(Object other)
	{
		// Hint: use instanceof
		// See: https://www.sitepoint.com/implement-javas-equals-method-correctly/
		return false;
	}

	/**
	 * @return String describing the object, including type, make and frame number
	 */
	@Override
	public String toString()
	{
		//TODO:
		return "Hello, I'm a Cycle";
	}
}
