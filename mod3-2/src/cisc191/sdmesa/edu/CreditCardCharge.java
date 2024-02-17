package cisc191.sdmesa.edu;

/**
 * Represents a credit card charge corresponding to the purchase of a {@link Boat}
 *
 * @author Stan Strum
 */
public class CreditCardCharge {
  /**
   * The year that this charge occurred
   */
  private int year;

  /**
   * The month that this charge occurred
   */
  private int month;

  /**
   * The day that this charge occurred
   */
  private int day;

  /**
   * The {@link Boat} that was purchased
   */
  private Boat boat;

  /**
   * The vendor for the purchase
   */
  private String company;

  /**
   * The card used for this purchase
   */
  private CreditCard card;

  /**
   * Basic constructor
   *
   * @param year year the charge occurred
   * @param month month the charge occurred
   * @param day day the charge occurred
   * @param boat boat that was purchased
   * @param company vendor for purchase
   * @param card card used for purchase
   */
  public CreditCardCharge(int year, int month, int day, Boat boat, String company, CreditCard card) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.boat = boat;
    this.company = company;
    this.card = card;
  }

  /**
   * @return a String representation of this purchase
   */
  public String toString() {
    // e.g. "2020/8/14 4444111122223333 12/24 123 Alex Keaton BoatCo SpeedyBoat $19995"

    return String.format(
      "%d/%d/%d %s %s %s $%d",
      this.year, this.month, this.day,
      this.card.toString(),
      this.company,
      this.boat.getMake(),
      this.boat.getPrice()
    );
  }
}
