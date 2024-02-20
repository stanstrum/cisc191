package cisc191.sdmesa.edu;

import java.util.ArrayList;

/**
 * A bike shop with an inventory of {@link Cycle Cycles}
 *
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 */
public class BikeShop {
	/**
	 * The name of the bike shop
	 */
	private final String name;

	/**
	 * The inventory of the bike shop; contains any number of
	 * Cycles and derivatives thereof
	 */
	private ArrayList<Cycle> inventory = new ArrayList<>();

	/**
	 * Standard constructor
	 *
	 * @param name the bike shop's name
	 */
	public BikeShop(String name)
	{
		this.name = name;
	}

	/**
	 * Adds a {@link Cycle} to the shop's inventory
	 *
	 * @param cycle cycle to add
	 */
	public void addToInventory(Cycle cycle)
	{
		this.inventory.add(cycle);
	}

	@Override
	public String toString()
	{
		return String.format("BikeShop: %s, inventory: %s", this.name, this.inventory.toString());
	}
}
