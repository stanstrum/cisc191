package cisc191.sdmesa.edu;

/**
 * Represents a person by their basic personal information
 *
 * @author Stan Strum
 */
public class Person {
	/**
	 * The person's name
	 */
	private String name;

	/**
	 * The person's phone number
	 */
	private String phoneNumber;

	/**
	 * The person's zip code
	 */
	private String zipCode;

	/**
	 * Standard constructor
	 *
	 * @param name name of person
	 * @param phoneNumber phone number of person
	 * @param zipCode zip code of person
	 */
	public Person(String name, String phoneNumber, String zipCode)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}

	/**
	 * @return {@link Person#name}
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Sets {@link Person#name}
	 *
	 * @param name new name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return a String representation of this person's basic information
	 */
	public String toString()
	{
		// e.g. "Alex Keaton 619-555-1212 92111"

		return String.format(
			"%s %s %s",
			this.name,
			this.phoneNumber,
			this.zipCode
		);
	}
}
