package cisc191.sdmesa.edu;

/**
 * An electric object that holds a charge that may be modified
 *
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 */
public interface Electric {
  /**
   * @return the electric object's current charge
   */
  int getCharge();

  /**
   * Charges an electric object by a specified amount
   *
   * @param amount amount to charge by
   */
  void charge(int amount);
}
