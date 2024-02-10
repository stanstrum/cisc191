package cisc191.sdmesa.edu;

/**
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Responsibilities of class:
 */

public class CreditCard {
  private String accountNumber;
  private String expiry;
  private String cvv;
  private Person person;

  CreditCard(String accountNumber, String expiry, String cvv, Person person) {
    this.accountNumber = accountNumber;
    this.expiry = expiry;
    this.cvv = cvv;
    this.person = person;
  }

  @Override
  public String toString() {
    return String.format(
      "%s %s %s %s",
      this.accountNumber,
      this.expiry,
      this.cvv,
      this.person.getName()
    );
  }
}

