package cisc191.sdmesa.edu;

/**
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Responsibilities of class:
 */

public class Person {
  private String name;
  private String phoneNumber;
  private String zipCode;

  /**
   * @return {@link Person#name}
   */
  public String getName() {
    return name;
  }

  /**
   * Sets {@link Person#name}
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  Person(String name, String phoneNumber, String zipCode) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return String.format(
      "%s %s %s",
      this.name,
      this.phoneNumber,
      this.zipCode
    );
  }
}

