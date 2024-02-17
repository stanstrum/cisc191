package cisc191.sdmesa.edu;

/**
 * @author Stan Strum
 */
public class Person {
  private String name;
  private String phoneNumber;
  private String zipCode;

  public Person(String name, String phoneNumber, String zipCode) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.zipCode = zipCode;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return String.format("%s %s %s", this.name, this.phoneNumber, this.zipCode);
  }
}
