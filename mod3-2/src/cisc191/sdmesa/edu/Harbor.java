package cisc191.sdmesa.edu;

/**
 * @author Stan Strum
 */
public class Harbor {
  Boat[] inventory;

  public Harbor(int slips) {
    this.inventory = new Boat[slips];
  }

  public Boat getBoatAt(int slip) {
    return this.inventory[slip];
  }

  public Boat parkBoatAt(Boat newBoat, int slip) {
    Boat oldBoat = this.inventory[slip];

    this.inventory[slip] = newBoat;

    return oldBoat;
  }

  public Boat[] getInventory() {
    // Duplicate our inventory so that it cannot be modified by caller
    Boat[] inventoryCopy = new Boat[this.inventory.length];

    for (int i = 0; i < this.inventory.length - 1; i++) {
      inventoryCopy[i] = inventory[i];
    }

    return inventoryCopy;
  }
}
