package entities.animal_entities;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import entities.plant_entities.Plant;

public class Herbivore extends Animal {
	/**
	 * The plants that the herbivore eats
	 */
	private Set<Plant> plantDiet = new HashSet<Plant>();

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the herbivorous animal
	 */
	public Herbivore(String name) {
		super(name);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the herbivorous animal
	 * @param weight - The weight of the herbivorous animal
	 * @param height - The height of the herbivorous animal
	 * @param length - The length of the herbivorous animal
	 */
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	/**
	 * Get the plant diet of the herbivorous animal.
	 * 
	 * @return The plantDiet
	 */
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	/**
	 * Set the plant diet of the herbivorous animal.
	 * 
	 * @param plantDiet - The plantDiet to set
	 */
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	/**
	 * Add a plant to the herbivorous animal.
	 * 
	 * @param plant - The plant to add to the diet
	 */
	public void addPlantToDiet(Plant plant) {
		this.plantDiet.add(plant);
	}

	/**
	 * Print the diet of the herbivorous animal.
	 */
	public void printDiet() {
		Stream.of(this.plantDiet).forEach(plant -> System.out.println(((Plant) plant).getName()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String string = " Herbivorous animal:\n Name: " + this.getName() + "\n Weight: " + this.getWeight()
				+ "\n Height: " + this.getHeight() + "\n Length: " + this.getLength() + "\n Diet: ";
		for (Plant plant : plantDiet) {
			string += "\n  -" + plant.getName();
		}

		return string;
	}
}
