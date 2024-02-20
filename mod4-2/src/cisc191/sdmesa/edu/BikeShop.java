package cisc191.sdmesa.edu;

import java.util.ArrayList;

/**
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 */
public class BikeShop {
	private final String name;

	private ArrayList<Cycle> inventory = new ArrayList<>();

	public BikeShop(String name) {
		this.name = name;
	}

  public void addToInventory(Cycle cycle) {
		this.inventory.add(cycle);
  }

	@Override
	public String toString() {
		return String.format("BikeShop: %s, inventory: %s", this.name, this.inventory.toString());
	}
}
