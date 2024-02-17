package cisc191.sdmesa.edu;

/**
 * @author Stan Strum
 */
public class CreditCardCharge {
  private int year;
  private int month;
  private int day;
  private Boat boat;
  private String company;
  private CreditCard card;

  public CreditCardCharge(int year, int month, int day, Boat boat, String company, CreditCard card) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.boat = boat;
    this.company = company;
    this.card = card;
  }

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
