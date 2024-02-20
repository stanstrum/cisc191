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
 * A a Bicycle is a Cycle with two wheels
 */
public class Bicycle extends Cycle implements Gearable
{
	private Color color;
	private int speed;

	private int gear = 1;

  public Bicycle(String arg0) {
    super(arg0);
  }

	@Override
	int getNumberOfWheels() {
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

  @Override
  public int getSpeed() {
    return this.speed;
  }

  @Override
  public void speedUp() {
    this.speed++;
  }
}
