package cisc191.sdmesa.edu;

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
 * ElectricMountainBike is a Bicyle that is Movable, Gearable, and Electric
 */

public class ElectricMountainBike extends Bicycle implements Electric
{
  public ElectricMountainBike(String arg0) {
		super(arg0);

		throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public void charge(int arg0) {
		throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public int getCharge() {
		throw new UnsupportedOperationException("Not implemented");
  }
}
