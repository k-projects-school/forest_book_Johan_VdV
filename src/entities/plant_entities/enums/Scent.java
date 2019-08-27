package entities.plant_entities.enums;

public enum Scent {
	SWEET, ORANGE, PINEAPLE, MUSKY, EARTHY, SOUR;
	
	/**
	 * Get the readable name of the scent.
	 * 
	 * @return - The name
	 */
	public String getName() {
		return this.name().charAt(0) + this.name().toLowerCase().substring(1);
	}
}
