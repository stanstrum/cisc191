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
  public Bicycle(String arg0) {
    super(arg0);
  }

	@Override
	int getNumberOfWheels() {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	Color getColor() {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	void setColor(Color newColor) {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public int getGear() {
		throw new UnsupportedOperationException("Not implemented");
	}

  @Override
  public void gearUp() {
		throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public void gearDown() {
		throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public int getSpeed() {
    throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public void speedUp() {
    throw new UnsupportedOperationException("Not implemented");
  }
}
