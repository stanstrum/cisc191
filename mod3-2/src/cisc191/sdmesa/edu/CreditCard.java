package cisc191.sdmesa.edu;

/**
 * Represents a credit card
 *
 * @author Stan Strum
 */
public class CreditCard {
  /**
   * <p>
   * The 16-digit account number of this card
   * </p><p>
   * NOTE: this should be a String of length 16, i.e. all digits, no spaces, no dashes.
   * </p>
   */
  private String accountNumber;

  /**
   * <p>
   * The expiration date of this card
   * </p><p>
   * NOTE: this should be a String in the format {@code mm/yy}
   * </p>
   */
  private String expirationDate;

  /**
   * <p>
   * The CVV (Card Verification Value) of this value
   * </p><p>
   * NOTE: this should be a String of length 3, all digits
   * </p>
   */
  private String cvv;

  /**
   * The holder of this card
   */
  private Person holder;

  /**
   * Standard constructor
   *
   * @param accountNumber 16-digit account number of card
   * @param expirationDate expiration date of card (mm/yy)
   * @param cvv 3-digit CVV of card
   * @param holder cardholder
   */
  public CreditCard(String accountNumber, String expirationDate, String cvv, Person holder)
  {
    this.accountNumber = accountNumber;
    this.expirationDate = expirationDate;
    this.cvv = cvv;
    this.holder = holder;
  }

  /**
   * @return a String representation of this card
   */
  public String toString()
  {
    // e.g. "4444111122223333 12/24 123 Alex Keaton"

    return String.format(
      "%s %s %s %s",
      this.accountNumber,
      this.expirationDate,
      this.cvv,
      this.holder.getName()
    );
  }
}
