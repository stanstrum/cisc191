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
 * ElectricMountainBike is a Bicyle (therefore Movable, Gearable)that is , and Electric
 */

public class ElectricMountainBike extends Bicycle implements Electric
{
	/**
	 * The electric bike's current charge
	 */
	private int charge;

	/**
	 * Standard constructor
	 *
	 * @param make the make of the electric bike, immutable
	 *
	 * @see {@link Cycle#Cycle(String)}
	 */
	public ElectricMountainBike(String make) {
		super(make);
	}

	@Override
	public void charge(int charge) {
		this.charge += charge;
	}

	@Override
	public int getCharge() {
		return this.charge;
	}
}
