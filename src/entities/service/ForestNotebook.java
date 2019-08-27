package entities.service;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.exceptions.AlreadyInListException;
import entities.plant_entities.Plant;

public class ForestNotebook {

	/**
	 * A list of carnivores seen on walks.
	 */
	private List<Carnivore> carnivores = new LinkedList<Carnivore>();

	/**
	 * A list of omnivores seen on walks.
	 */
	private List<Omnivore> omnivores = new LinkedList<Omnivore>();

	/**
	 * A list of herbivores seen on walks.
	 */
	private List<Herbivore> herbivores = new LinkedList<Herbivore>();

	/**
	 * A list of all the animals seen on walks.
	 */
	private List<Animal> animals = new LinkedList<Animal>();

	/**
	 * A list of all the plants seen on walks.
	 */
	private List<Plant> plants = new LinkedList<Plant>();

	/**
	 * The amount of plants in the lists
	 */
	private int plantCount = 0;

	/**
	 * The amount of animals in the list
	 */
	private int animalCount = 0;

	/**
	 * Constructor.
	 */
	public ForestNotebook() {
		super();
	}

	/**
	 * Get the carnivores.
	 * 
	 * @return The carnivores
	 */
	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	/**
	 * Set the carnivores.
	 * 
	 * @param carnivores - The carnivores to set
	 */
	public void setCarnivores(List<Carnivore> carnivores) {
		if (this.animalCount > 0) {
			this.animalCount -= this.carnivores.size();
		}

		this.carnivores = carnivores;
		this.animalCount += this.carnivores.size();

	}

	/**
	 * Get the omnivores.
	 * 
	 * @return The omnivores
	 */
	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	/**
	 * Set the omnivores.
	 * 
	 * @param omnivores - The omnivores to set
	 */
	public void setOmnivores(List<Omnivore> omnivores) {
		if (this.animalCount > 0) {
			this.animalCount -= this.omnivores.size();
		}
		this.omnivores = omnivores;
		this.animalCount += this.omnivores.size();
	}

	/**
	 * Get the herbivores.
	 * 
	 * @return The herbivores
	 */
	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	/**
	 * Set the herbivores.
	 * 
	 * @param herbivores - The herbivores to set
	 */
	public void setHerbivores(List<Herbivore> herbivores) {
		if (this.animalCount > 0) {
			this.animalCount -= this.herbivores.size();
		}
		this.herbivores = herbivores;
		this.animalCount += this.herbivores.size();
	}

	/**
	 * Get the count of the plants seen on walks.
	 * 
	 * @return The count of plants
	 */
	public int getPlantCount() {
		return this.plantCount;
	}

	/**
	 * Get the count of animals seen on walks.
	 * 
	 * @return The count of animals
	 */
	public int getAnimalCount() {
		return this.animalCount;
	}

	/**
	 * Add an animal to the notebook.
	 * 
	 * @param animal - The animal to add
	 */
	public void addAnimal(Animal animal) {
		try {
			if (animal == null) {
				throw new NullPointerException("The animall can't be NULL.");
			}

			if (this.animals.contains(animal)) {
				throw new AlreadyInListException("The animal " + animal.getName() + " is already in the animal list.");
			}

			// Switch the class name of the given animal.
			switch (animal.getClass().getSimpleName()) {
			// If the animal is from the type "Carnivore", add it to the carnivores
			case "Carnivore":
				this.carnivores.add((Carnivore) animal);
				break;
			// If the animal is from the type "Herbivore", add it to the herbivores
			case "Herbivore":
				this.herbivores.add((Herbivore) animal);
				break;
			// If the animal is from the type "Omnivore", add it to the omnivores
			case "Omnivore":
				this.omnivores.add((Omnivore) animal);
				break;
			}

			// Add the animal to the animal list
			this.animals.add(animal);
			this.animalCount++;
		} catch (NullPointerException | AlreadyInListException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Add a plant to the plant list.
	 * 
	 * @param plant - The plant to add
	 */
	public void addPlant(Plant plant) {
		try {
			if (plant == null) {
				throw new NullPointerException("The plant can't be NULL.");
			}

			if (this.plants.contains(plant)) {
				throw new AlreadyInListException("The plant " + plant.getName() + " is already in the list.");
			}

			this.plants.add(plant);
			this.plantCount++;
		} catch (NullPointerException | AlreadyInListException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Print the notebook's content.
	 */
	public void printNotebook() {
		System.out.println("Notebook:\n\n Animals:\n You have seen " + this.getAnimalCount() + " animals.");
		for (Animal animal : this.animals) {
			System.out.println(animal);
			System.out.println("----------------------");
		}
		System.out.println(" Plants:\n You have seen " + this.getPlantCount() + " plant(s).");
		for (Plant plant : this.plants) {
			System.out.println(plant);
			System.out.println("----------------------");
		}
	}

	/**
	 * Sort the animals by their name in alphabetical order.
	 */
	public void sortAnimalsByName() {
		this.animals.sort(new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	/**
	 * Sort the plants by their name in alphabetical order.
	 */
	public void sortPlantsByName() {
		this.plants.sort(new Comparator<Plant>() {
			@Override
			public int compare(Plant o1, Plant o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	/**
	 * Sort the animals by their height
	 */
	public void sortAnimalsByHeight() {
		this.animals.sort(new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				return Double.compare(o1.getHeight(), o2.getHeight());
			}
		});
	}

	/**
	 * Sort the animals by their height
	 */
	public void sortPlantsByHeight() {
		this.plants.sort(new Comparator<Plant>() {
			@Override
			public int compare(Plant o1, Plant o2) {
				return Double.compare(o1.getHeight(), o2.getHeight());
			}
		});
	}
}
