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
 * A Cycle is a Movable object with a unique frame number, an original make, and interfaces
 * for higher-level features a cycle may have.
 */
public abstract class Cycle implements Movable
{
	/**
	 * The frame number of the cycle.  This may never be changed
	 * and is unique to each cycle, be it a unicycle or an electric
	 * bicycle.
	 */
	private final int frameNumber = Cycle.generateFrameNumber();

	/**
	 * The cycle's make at time of manufacture.  While one may rebuild
	 * a bicycle to resemble a different model, this field must always
	 * correspond to what was originally sold.
	 */
	private final String make;

	/**
	 * An internal counter for generating unique frame numbers.
	 *
	 * Do not touch.
	 */
	private static int nextFrameNumber = 1;

	/**
	 * A helper method to acquire a new, unique frame number and increment
	 * the internal counter so that the next invocation is also unique
	 *
	 * @return a unique frame number
	 */
	private static int generateFrameNumber() {
		return Cycle.nextFrameNumber++;
	}

	/**
	 * <p>
	 * Standard constructor
	 * </p><p>
	 * NOTE: a cycle's make corresponds to the make it was originally built as
	 * and therefore cannot be modified later
	 * </p>
	 *
	 * @param make the make of the cycle
	 */
	public Cycle(String make)
	{
		this.make = make;
	}

	/**
	 * @return the number of wheels on this {@link Cycle}
	 */
	abstract int getNumberOfWheels();

	/**
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 *
	 * @param color
	 */
	abstract void setColor(Color color);

	/**
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake()
	{
		return this.make;
	}

	/**
	 * @return the unique serial number that was stamped in the frame when the bike was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	public int getFrameNumber()
	{
		return this.frameNumber;
	}

	/**
	 * Compares two {@link Cycle Cycles} by frame number.  Note that no unique cycle
	 * may carry the same frame number as another, therefore any aftermarket modifications
	 * and configurations are not compared in this method.
	 *
	 * @return true if the frame number are the same
	 *
	 * @see {@link Cycle#frameNumber}
	 */
	@Override
	public boolean equals(Object other)
	{
		// If other object is not a cycle, it cannot be equal
		if (other instanceof Cycle == false) {
			return false;
		}

		// Cast other to Cycle since it is `instanceof Cycle`
		Cycle otherAsCycle = (Cycle)other;

		// If the frame numbers match, then they are the same bicycle
		return this.getFrameNumber() == otherAsCycle.getFrameNumber();
	}

	/**
	 * @return String describing the object, including type, make and frame number
	 */
	@Override
	public String toString()
	{
		// e.g. "Cycle: make: Toony, frame number: 1, color: java.awt.Color[r=0,g=0,b=0]"

		return String.format("Cycle: make: %s, frame number: %d, color: %s", this.getMake(), this.getFrameNumber(), this.getColor());
	}
}
