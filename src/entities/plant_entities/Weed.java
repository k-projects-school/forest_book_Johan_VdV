package entities.plant_entities;

public class Weed extends Plant {
	/**
	 * The area of the weed.
	 */
	private double area = 0;

	/**
	 * Constructor.
	 * 
	 * @param name - The name of the weed
	 */
	public Weed(String name) {
		super(name);
	}

	/**
	 * Constructor.
	 * 
	 * @param name   - The name of the weed
	 * @param height - The height of the weed
	 */
	public Weed(String name, double height) {
		super(name, height);
	}

	/**
	 * Get the area of the weed.
	 * 
	 * @return The area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * Set the area of the weed.
	 * 
	 * @param area - The area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Weed:\n Name: " + this.getName() + "\n Area: " + this.area + "\n Height: " + this.getHeight();
	}
}
