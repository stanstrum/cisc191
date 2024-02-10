package cisc191.sdmesa.edu;

/**
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Responsibilities of class:
 */

public class CreditCardCharge {
  private int year;
  private int month;
  private int day;
  private Boat boat;
  private String companyName;
  private CreditCard creditCard;

  CreditCardCharge(int year, int month, int day, Boat boat, String companyName, CreditCard creditCard) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.boat = boat;
    this.companyName = companyName;
    this.creditCard = creditCard;
  }

  @Override
  public String toString() {
    return String.format(
      "%d/%d/%d %s %s %s $%d",
      this.year,
      this.month,
      this.day,
      this.creditCard.toString(),
      this.companyName,
      this.boat.getMake(),
      this.boat.getPrice()
    );
  }
}

