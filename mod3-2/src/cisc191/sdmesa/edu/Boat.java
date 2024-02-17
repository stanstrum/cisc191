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
 * Version/date: 16 Feb 2024
 *
 * Responsibilities of class:
 * A class that holds the information pertinent to a boat, e.g. make, color, price, owner, etc.
 */
public class Boat
{
	/**
	 * The static counter used in each instantiation of a {@link Boat} to
	 * ensure unique serial numbers are assigned to boats
	 */
	private static int nextSerialNumber = 1;

	/**
	 * <p>
	 * The make of this boat
	 * </p><p>
	 * Default: {@code null}
	 * </p>
	 */
	private String make;

	/**
	 * <p>
	 * The color of this boat
	 * </p><p>
	 * Default: {@code null}
	 * </p>
	 */
	private Color color;

	/**
	 * <p>
	 * The speed of this boat
	 * </p><p>
	 * Default: {@code 0}
	 * </p>
	 */
	private int speed = 0;

	/**
	 * <p>
	 * The price of this boat
	 * </p><p>
	 * Default: {@code -1}
	 * </p>
	 */
	private int price = -1;

	/**
	 * <p>
	 * The owner of this boat
	 * </p><p>
	 * Default: {@code null}
	 * </p>
	 */
	private Person owner;

	/**
	 * <p>
	 * The serial number of this boat
	 * </p><p>
	 * NOTE: this value is unique for each instantiation of {@link Boat},
	 * even using the {@link Boat#Boat(Boat) copy constructor}, and cannot be
	 * modified through public methods.
	 * </p>
	 */
	private int serialNumber = Boat.createNewSerialNumber();

	/**
	 * The no-argument constructor
	 *
	 * @see {@literal member fields for their default values}
	 */
	public Boat() {}

	/**
	 * <p>
	 * The copy constructor
	 * </p><p>
	 * NOTE: this method does not copy the serial number of the {@code boat} parameter,
	 * and the resulting instance will carry a unique serial number.
	 * <p>
	 *
	 * @param boat Boat to copy from
	 */
	public Boat(Boat boat) {
		// copy fields
		this.make = boat.make;
		this.color = boat.color;
		this.speed = boat.speed;
		this.price = boat.price;

		this.owner = boat.owner;
	}

	/**
	 * The basic constructor
	 *
	 * @param make Make of the boat
	 * @param color Color of the boat
	 */
	public Boat(String make, Color color) {
		this.make = make;
		this.color = color;
	}

	/**
	 * @return {@link Boat#make}
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return {@link Boat#color}
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Sets {@link Boat#color}
	 *
	 * @param color new color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return {@link Boat#speed}
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * Increments {@link Boat#speed}
	 */
	public void speedUp() {
		this.speed++;
	}

	/**
	 * Decrements {@link Boat#speed}
	 */
	public void slowDown() {
		this.speed--;
	}

	/**
	 * @return {@link Boat#price}
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * Sets {@link Boat#price}
	 *
	 * @param color new price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Sets {@link Boat#owner}
	 *
	 * @param color new owner
	 */
	public void setOwner(Person person) {
		this.owner = person;
	}

	/**
	 * @return {@link Boat#owner}
	 */
	public Person getOwner() {
		return this.owner;
	}

	/**
	 * @return {@link Boat#serialnumber}
	 */
	public int getSerialNumber() {
		return this.serialNumber;
	}

	/**
	 * Generates a new serial number (greater than zero) and increments
	 * an internal counter to ensure unique return values
	 *
	 * @return a unique serial number
	 */
	public static int createNewSerialNumber() {
		// Get the next serial number
		int serialNumber = Boat.nextSerialNumber;

		// We used up that number, increment the counter
		Boat.nextSerialNumber++;

		// Return the unique serial number
		return serialNumber;
	}

	/**
	 * <p>
	 * Compares two boats by their serial number
	 * </p><p>
	 * NOTE: Each boat is instantiated with a unique serial number which
	 * cannot be reassigned.  Therefore, if two Boat objects share
	 * the same serial number, they are the same boat--perhaps with
	 * different properties.
	 * </p>
	 *
	 * @param otherBoat other {@link Boat} to compare against
	 *
	 * @return {@code true} if both boats have the same serial number,
	 *         {@code false} otherwise
	 */
	public boolean equals(Boat otherBoat) {
		return this.serialNumber == otherBoat.getSerialNumber();
	}

	/**
	 * @return a String representation of this boat
	 */
	public String toString() {
		return String.format("Boat: make: %s color: %s", this.make, this.color.toString());
	}
}
