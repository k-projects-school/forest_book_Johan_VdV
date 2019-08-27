package entities.plant_entities.enums;

public enum LeafType {
	NEEDLE, ROUND, HAND, HEART, SPEAR;

	/**
	 * Get the readable name of the leaf type.
	 * 
	 * @return The name
	 */
	public String getName() {
		return this.name().charAt(0) + this.name().toLowerCase().substring(1);
	}
}
