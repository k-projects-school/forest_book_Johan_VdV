package entities.animal_entities;

public class Carnivore extends Animal {

	/**
	 * The maximum size of the food for the carnivorous animal.
	 */
	private double maxFoodSize = 0;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the carnivorous animal
	 */
	public Carnivore(String name) {
		super(name);
	}

	/**
	 * 
	 * @param name   - The name of the carnivorous animal
	 * @param weight - The weight of the carnivorous animal
	 * @param height - The height of the carnivorous animal
	 * @param length - The length of the carnivorous animal
	 */
	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	/**
	 * Get the maximum food size.
	 * 
	 * @return The maxFoodSize
	 */
	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	/**
	 * Set the maximum food size.
	 * 
	 * @param maxFoodSize - The maxFoodSize to set
	 */
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Carnivorous animal:\n Name: " + this.getName() + "\n Weight: " + this.getWeight() + "\n Height: "
				+ this.getHeight() + "\n Length: " + this.getLength() + "\n Maximum size of food: " + this.maxFoodSize;
	}

}
