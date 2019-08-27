package entities.plant_entities;

import entities.plant_entities.enums.LeafType;

public class Bush extends Plant {
	/**
	 * The fruit available on this bush. By default it has no fruit.
	 */
	private String fruit = "No fruit on this bush.";

	/**
	 * The leaf type of the bush.
	 */
	private LeafType leafType;

	/**
	 * Constructor
	 * 
	 * @param name - The name of the bush
	 */
	public Bush(String name) {
		super(name);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the bush
	 * @param height - The height of the bush
	 */
	public Bush(String name, double height) {
		super(name, height);
	}

	/**
	 * @return The fruit
	 */
	public String getFruit() {
		return fruit;
	}

	/**
	 * @param fruit - The fruit to set
	 */
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	/**
	 * @return The leafType
	 */
	public LeafType getLeafType() {
		return leafType;
	}

	/**
	 * @param leafType - The leafType to set
	 */
	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Bush: \n Name: " + this.getName() + "\n Leaf type: " + this.leafType.getName() + "\n Fruit: "
				+ this.fruit + "\n Height: " + this.getHeight();
	}

}
