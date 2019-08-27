package entities.plant_entities;

import entities.plant_entities.enums.LeafType;

public class Tree extends Plant {

	/**
	 * The type of leafs on the tree.
	 */
	private LeafType leafType;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the tree
	 */
	public Tree(String name) {
		super(name);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the tree
	 * @param height - The height of the tree
	 */
	public Tree(String name, double height) {
		super(name, height);
	}

	/**
	 * Get the type of leafs of the tree.
	 * 
	 * @return The leafType
	 */
	public LeafType getLeafType() {
		return leafType;
	}

	/**
	 * Set the type of leafs of the tree.
	 * 
	 * @param leafType - The leafType to set
	 */
	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Tree:\n Name: " + this.getName() + "\n Leaf tpe: " + this.leafType.getName() + "\n Height: " + this.getHeight();
	}	
}
