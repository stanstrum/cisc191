package cisc191.sdmesa.edu;

/**
 * @author Stan Strum
 */
public class CreditCard {
  private String accountNumber;
  private String expirationDate;
  private String cvv;
  private Person holder;

  public CreditCard(String accountNumber, String expirationDate, String cvv, Person holder) {
    this.accountNumber = accountNumber;
    this.expirationDate = expirationDate;
    this.cvv = cvv;
    this.holder = holder;
  }

  public String toString() {
    // e.g. "4444111122223333 12/24 123 Alex Keaton"
    return String.format("%s %s %s %s", this.accountNumber, this.expirationDate, this.cvv, this.holder.getName());
  }
}
