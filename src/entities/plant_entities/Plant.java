package entities.plant_entities;

public class Plant {
	private String name;
	private double height;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the plant
	 */
	public Plant(String name) {
		this.name = name;
	}

	/**
	 * Constructor
	 * 
	 * @param name   - The name of the plant
	 * @param height - The height of the plant
	 */
	public Plant(String name, double height) {
		this.name = name;
		this.height = height;
	}

	/**
	 * @return The height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height - The height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getName() == null) ? 0 : this.getName().hashCode());
		result = (int) (prime * result + this.getHeight());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Plant plant = (Plant) obj;
		if (this == plant) {
			return true;
		}
		if (plant == null || this.getClass() != plant.getClass() || this.getHeight() != plant.getHeight()
				|| (this.getName() == null && plant.getName() != null) || !this.getName().equals(plant.getName())) {
			return false;
		}

		//TODO wat gebeurt er als je bv de Tree class verwijdert of een nieuwe class zou aanmaken ?
		// dan moet je telkens de equals methode van Plant gaan aanpassen
		// de oplossing hiervoor is om altijd in de subclasses de equals methode te override

		// Switch between the types of plants
		switch (obj.getClass().getSimpleName()) {
		case "Tree":
			// If it's a tree check the leaf type
			Tree tree = (Tree) plant;
			Tree thisTree = (Tree) this;
			if (!thisTree.getLeafType().equals(tree.getLeafType())) {
				return false;
			}
			break;
		case "Flower":
			// If it's a flower, check the smell
			Flower flower = (Flower) plant;
			Flower thisFlower = (Flower) this;
			if (!thisFlower.getSmell().equals(flower.getSmell())) {
				return false;
			}
			break;
		case "Bush":
			// If it's a bush, check the leaf type and the fruit
			Bush bush = (Bush) plant;
			Bush thisBush = (Bush) this;
			if (!thisBush.getLeafType().equals(bush.getLeafType()) || !thisBush.getFruit().equals(bush.getFruit())) {
				return false;
			}
			break;
		case "Weed":
			// If it's a weed, check the area
			Weed weed = (Weed) plant;
			Weed thisWeed = (Weed) this;
			if (thisWeed.getArea() != weed.getArea()) {
				return false;
			}
			break;
		}

		return true;
	}

}
