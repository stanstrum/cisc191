package cisc191.sdmesa.edu;

/**
 * Represents a harbor that holds {@link Boat Boats} in slips
 *
 * @author Stan Strum
 */
public class Harbor {
  /**
   * "Inventory" of harbor, i.e. the list of (possibly {@code null}) {@link Boat Boats} stored herein
   */
  Boat[] inventory;

  /**
   * Basic constructor
   *
   * @param slips amount of slips this {@link Harbor} should have
   */
  public Harbor(int slips) {
    this.inventory = new Boat[slips];
  }

  /**
   * <p>
   * Gets the {@link Boat} stored in the slip corresponding to the {@code slip} parameter
   * </p>
   * <p>
   * NOTE: this method may return {@code null} if there is no boat stored in the specified slip
   * </p>
   *
   * @param slip which slip (by index) to get a {@link Boat} instance
   *
   * @return the stored {@link Boat}, if there is one, otherwise {@code null}
   */
  public Boat getBoatAt(int slip) {
    return this.inventory[slip];
  }

  /**
   * Emplaces a {@link Boat} into this harbor
   *
   * @param newBoat {@link Boat} to store
   * @param slip the index of the slip to store said {@link Boat} in
   *
   * @return the {@link Boat} that was stored in the specified slip previously,
   *         otherwise {@code null}
   */
  public Boat parkBoatAt(Boat newBoat, int slip) {
    // Get old boat (may be `null`)
    Boat oldBoat = this.inventory[slip];

    // Emplace new boat (clobbers existing value in array)
    this.inventory[slip] = newBoat;

    return oldBoat;
  }

  /**
   * @return the harbor's "inventory" of boats
   *
   * @see {@link Harbor#inventory}
   */
  public Boat[] getInventory() {
    // Duplicate our inventory array so that it cannot be modified by caller
    Boat[] inventoryCopy = new Boat[this.inventory.length];

    // Copy each element over
    for (int i = 0; i < this.inventory.length - 1; i++) {
      inventoryCopy[i] = inventory[i];
    }

    // Return copied array
    return inventoryCopy;
  }
}
