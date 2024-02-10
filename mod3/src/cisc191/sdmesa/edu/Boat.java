package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Allan Schougaard {@literal <aschouga@sdccd.edu>}
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Other contributors:
 * N/A
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 * <<add more references here>>
 *
 * Version/date: 10 Feb 2024
 *
 * Responsibilities of class:
 * To implement methods that satisfy the challenge tests
 */
public class Boat
{
	private String make;
	private Color color;
	private int speed;
	private int price;
	private int serialNumber;
	private Person owner;

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
	 * @return {@link Boat#speed}
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * @return {@link Boat#price}
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * @return {@link Boat#serialNumber}
	 */
	public int getSerialNumber() {
		return this.serialNumber;
	}

	/**
	 * @return {@link Boat#owner}
	 */
	public Person getOwner() {
		return this.owner;
	}

	/**
	 * Sets {@link Boat#make}
	 *
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Sets {@link Boat#color}
	 *
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Sets {@link Boat#speed}
	 *
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * Sets {@link Boat#price}
	 *
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Sets {@link Boat#serialNumber}
	 *
	 * @param serialNumber
	 */
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Sets {@link Boat#owner}
	 *
	 * @param owner
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	Boat() {}
	Boat(String make, Color color) {
		this.make = make;
		this.color = color;
	}

	Boat(Boat other) {
		this.make = other.make;
		this.color = other.color;
		this.speed = other.speed;
		this.price = other.price;
		this.serialNumber = other.serialNumber;
	}

	public void speedUp() {
		throw new UnsupportedOperationException("Not implemented");
	}

	public void slowDown() {
		throw new UnsupportedOperationException("Not implemented");
	}

	public static int createNewSerialNumber() {
		throw new UnsupportedOperationException("Not implemented");
	}
}
