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
 * A Bicycle is a Cycle (therefore Movable) with two wheels that utilizes gears (Gearable).
 */
public class Bicycle extends Cycle implements Gearable
{
	/**
	 * The bike's color
	 */
	private Color color;

	/**
	 * The bike's speed
	 */
	private int speed;

	/**
	 * The gear that the bike is currently in
	 */
	private int gear = 1;

	/**
	 * Standard constructor
	 *
	 * @param make make of bicycle at time of manufacture, immutable
	 *
	 * @see {@link Cycle#Cycle(String)}
	 */
  public Bicycle(String make) {
    super(make);
  }

	@Override
	int getNumberOfWheels() {
		// A bicycle has two wheels
		return 2;
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

	@Override
	public int getGear() {
		return this.gear;
	}

  @Override
  public void gearUp() {
		this.gear++;
  }

  @Override
  public void gearDown() {
		this.gear--;
  }
}
