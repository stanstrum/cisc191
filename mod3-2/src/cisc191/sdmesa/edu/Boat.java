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
 * To implement the methods in the manner required to satisfy the tests.
 */
public class Boat
{
	private static int serialNumberCounter = 1;

	private String make;
	private Color color;
	private int speed = 0;
	private int price = -1;

	private Person owner;
	private int serialNumber = Boat.createNewSerialNumber();

	public Boat() {}

	public Boat(Boat boat) {
		this.make = boat.make;
		this.color = boat.color;
		this.speed = boat.speed;
		this.price = boat.price;

		this.owner = boat.owner;
	}

	public Boat(String make, Color color) {
		this.make = make;
		this.color = color;
	}

	public String getMake() {
		return this.make;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void speedUp() {
		this.speed++;
	}

	public void slowDown() {
		this.speed--;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setOwner(Person person) {
		this.owner = person;
	}

	public Person getOwner() {
		return this.owner;
	}

	public int getSerialNumber() {
		return this.serialNumber;
	}

	public static int createNewSerialNumber() {
		int serialNumber = Boat.serialNumberCounter;

		Boat.serialNumberCounter++;

		return serialNumber;
	}

	public boolean equals(Boat otherBoat) {
		// Each boat is instantiated with a unique serial number which
		// cannot be reassigned.  Therefore, if two Boat objects share
		// the same serial number, they are the same boat--perhaps with
		// different properties.
		return this.serialNumber == otherBoat.getSerialNumber();
	}

	public String toString() {
		return String.format("Boat: make: %s color: %s", this.make, this.color.toString());
	}
}
