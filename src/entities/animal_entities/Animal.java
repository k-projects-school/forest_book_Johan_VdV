package entities.animal_entities;

public class Animal {
	private String name;
	//TODO geen inline declaratie & initialisatie, het is niet goed leesbaar.
	// wat is de deafualt waarde van een double als die niet geinitaliseerd is?
	// dus de initialisatie is redundant in dit geval
	private double weight = 0, height = 0, length = 0;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the animal
	 */
	public Animal(String name) {
		this(name, 0, 0, 0);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the animal
	 * @param weight - The weight of the animal
	 * @param height - The height of the animal
	 * @param length - The length of the animal
	 */
	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	/**
	 * Get the weight of the animal.
	 * 
	 * @return The weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Set the weight of the animal.
	 * 
	 * @param weight - The weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Get the height of the animal.
	 * 
	 * @return The height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Set the height of the animal.
	 * 
	 * @param height - The height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Get the length of the animal.
	 * 
	 * @return The length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Set the length of the animal.
	 * 
	 * @param length - The length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Get the animal's name.
	 * 
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
		result = (int) (prime * result + this.getWeight());
		result = (int) (prime * result + this.getLength());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Animal temp = (Animal) obj;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || this.getHeight() != temp.getHeight()
				|| this.getLength() != temp.getLength() || this.getWeight() != temp.getWeight()
				|| (this.getName() == null && temp.getName() != null) || !this.getName().equals(temp.getName())) {
			return false;
		}

		return true;
	}

}
