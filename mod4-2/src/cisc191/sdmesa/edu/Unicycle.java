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
 * A Unicycle is a Cycle with only one wheel
 */

public class Unicycle extends Cycle
{
	private Color color;

	private int speed = 0;

	public Unicycle(String arg0) {
		super(arg0);
	}

	@Override
	int getNumberOfWheels() {
		// A unicycle has one wheel
		return 1;
	}

	@Override
	Color getColor() {
		return this.color;
	}

	@Override
	void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	@Override
	public void speedUp() {
		this.speed++;
	}
}
