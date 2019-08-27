package entities.forestbook_app;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Bush;
import entities.plant_entities.Flower;
import entities.plant_entities.Plant;
import entities.plant_entities.Tree;
import entities.plant_entities.Weed;
import entities.plant_entities.enums.LeafType;
import entities.plant_entities.enums.Scent;
import entities.service.ForestNotebook;

public class ForestBookApp {

	public static void main(String[] args) {
		// Create a notebook
		ForestNotebook myHikingJournal = new ForestNotebook();
		// Create some plants and add them to the notebook
		Flower rose = new Flower("Rose", 12.5);
		rose.setSmell(Scent.SWEET);
		myHikingJournal.addPlant(rose);
		Flower pioen = new Flower("Pioen", 35.25);
		pioen.setSmell(Scent.SWEET);
		myHikingJournal.addPlant(pioen);
		Tree oak = new Tree("Oak", 265.24);
		oak.setLeafType(LeafType.HAND);
		myHikingJournal.addPlant(oak);
		Weed horseFlower = new Weed("Horse flower", 10.3);
		horseFlower.setArea(13.6);
		myHikingJournal.addPlant(horseFlower);
		Bush buxus = new Bush("Buxus", 54.95);
		buxus.setLeafType(LeafType.ROUND);
		myHikingJournal.addPlant(buxus);
		// Create a plant set for diets
		Set<Plant> plants = new HashSet<Plant>();
		plants.add(horseFlower);
		plants.add(new Weed("Grass"));
		// Create some animals and add them to the notebook
		Herbivore cow = new Herbivore("Cow", 500, 1.5, 2);
		cow.setPlantDiet(plants);
		myHikingJournal.addAnimal(cow);
		Carnivore fox = new Carnivore("Fox", 35, 26.4, 52.6);
		fox.setMaxFoodSize(0.15);
		myHikingJournal.addAnimal(fox);
		Omnivore bear = new Omnivore("Bear", 250, 1.56, 2.3);
		bear.setPlantDiet(plants);
		bear.setMaxFoodSize(1.5);
		myHikingJournal.addAnimal(bear);
		Omnivore racoon = new Omnivore("Racoon", 20, 0.23, 0.6);
		racoon.setPlantDiet(plants);
		racoon.setMaxFoodSize(0.4);
		myHikingJournal.addAnimal(racoon);
		Omnivore chimp = new Omnivore("Chimpansee", 95, 0.65, 1.8);
		chimp.setPlantDiet(plants);
		chimp.setMaxFoodSize(0.4);
		myHikingJournal.addAnimal(chimp);
		Carnivore tiger = new Carnivore("Tiger", 35, 26.4, 52.6);
		tiger.setMaxFoodSize(0.15);
		myHikingJournal.addAnimal(tiger);
		Carnivore cat = new Carnivore("Cat", 35, 26.4, 52.6);
		cat.setMaxFoodSize(0.15);
		myHikingJournal.addAnimal(cat);
		Carnivore wolf = new Carnivore("Wolf", 35, 26.4, 52.6);
		wolf.setMaxFoodSize(0.15);
		myHikingJournal.addAnimal(wolf);
		Carnivore lion = new Carnivore("Lion", 35, 26.4, 52.6);
		lion.setMaxFoodSize(0.15);
		myHikingJournal.addAnimal(lion);
		// Print the amount of animals an plants
		System.out.println("Animals crossed: " + myHikingJournal.getAnimalCount());
		System.out.println("Plants seen: " + myHikingJournal.getPlantCount());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Print everything in the notebook unsorted");
		// Print everything in the notebook
		myHikingJournal.printNotebook();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Print all the animals");
		// Print all the animals
		Stream.of(myHikingJournal.getCarnivores()).forEach(System.out::println);
		Stream.of(myHikingJournal.getOmnivores()).forEach(System.out::println);
		Stream.of(myHikingJournal.getHerbivores()).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------");
		// Sort the animals and plants by name
		myHikingJournal.sortAnimalsByName();
		myHikingJournal.sortPlantsByName();
		System.out.println("Print everything in the notebook sorted by name");
		// Print everything in the notebook
		myHikingJournal.printNotebook();
		// Sort the animals and plants by height
		myHikingJournal.sortAnimalsByHeight();
		myHikingJournal.sortPlantsByHeight();
		System.out.println("Print everything in the notebook sorted by height");
		// Print everything in the notebook
		myHikingJournal.printNotebook();
	}

}
