package cisc191.sdmesa.edu;

/**
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Responsibilities of class:
 */

public class Harbor {
  private Boat[] inventory;

  public Boat getBoatAt(int index) {
    return this.inventory[index];
  }

  Harbor(int slips) {
    this.inventory = new Boat[slips];
  }

  public Boat parkBoatAt(Boat boat, int index) {
    Boat oldBoat = this.inventory[index];

    this.inventory[index] = boat;

    return oldBoat;
  }

  public Boat[] getInventory() {
    return this.inventory.clone();
  }
}

