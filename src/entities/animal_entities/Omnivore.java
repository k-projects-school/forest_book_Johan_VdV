package entities.animal_entities;

import java.util.HashSet;
import java.util.Set;

import entities.plant_entities.Plant;

public class Omnivore extends Animal {
	/**
	 * The plant diet of the omnivorous animal.
	 */
	private Set<Plant> plantDiet = new HashSet<Plant>();

	/**
	 * The maximum size of the food for the omnivorous animal.
	 */
	private double maxFoodSize = 0;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the herbivorous animal
	 */
	public Omnivore(String name) {
		super(name);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the omnivorous animal
	 * @param weight - The weight of the omnivorous animal
	 * @param height - The height of the omnivorous animal
	 * @param length - The length of the omnivorous animal
	 */
	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	/**
	 * @return the plantDiet
	 */
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	/**
	 * @param plantDiet the plantDiet to set
	 */
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	/**
	 * @return the maxFoodSize
	 */
	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	/**
	 * @param maxFoodSize the maxFoodSize to set
	 */
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	/**
	 * Add a plant to the omnivorous animal.
	 * 
	 * @param plant - The plant to add to the diet
	 */
	public void addPlantToDiet(Plant plant) {
		this.plantDiet.add(plant);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String string = " Omnivorous animal:\n Name: " + this.getName() + "\n Weight: " + this.getWeight()
				+ "\n Height: " + this.getHeight() + "\n Length: " + this.getLength() + "\n Diet: ";
		for (Plant plant : plantDiet) {
			string += "\n  -" + plant.getName();
		}

		string += "\n Maximum size of food: " + this.maxFoodSize;

		return string;
	}
}
