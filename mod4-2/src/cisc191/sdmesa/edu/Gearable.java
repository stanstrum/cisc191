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
 * Responsibilities of interface:
 * Gearable is an interface that allows for modifying a gearable object's internal gear state
 */
public interface Gearable
{
	/**
	 * @return the gear that object is currently in
	 */
	int getGear();

	/**
	 * Increments the object's gear
	 */
	void gearUp();

	/**
	 * Decrements the object's gear
	 */
	void gearDown();
}
