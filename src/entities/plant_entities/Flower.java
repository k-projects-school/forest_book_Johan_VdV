package entities.plant_entities;

import entities.plant_entities.enums.Scent;

public class Flower extends Plant {
	/**
	 * The scent of the flower.
	 */
	private Scent smell;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the flower
	 */
	public Flower(String name) {
		super(name);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the flower
	 * @param height - The height of the flower
	 */
	public Flower(String name, double height) {
		super(name, height);
	}

	/**
	 * Get the scent of the flower.
	 * 
	 * @return The smell
	 */
	public Scent getSmell() {
		return smell;
	}

	/**
	 * Set the scent of the flower.
	 * 
	 * @param smell - The smell to set
	 */
	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Flower:\n Name: " + this.getName() + "\n Scent: " + this.smell.getName() + "\n Height: "
				+ this.getHeight();
	}

}
