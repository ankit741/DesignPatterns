package com.pattern.decorator;

/**
 * The type Beverage.
 * @author Ankit Rawat
 */
public abstract class Beverage {

	/**
	 * The enum Size.
	 */
	public enum Size {
		/**
		 *Large size.
		 */
		LARGE,
		/**
		 *Medium size.
		 */
		MEDIUM,
		/**
		 *Small size.
		 */
		SMALL;
	}

	/**
	 * The Size.
	 */
	protected Size size;
	/**
	 * The Description.
	 */
	protected String description;

	/**
	 * Cost double.
	 *
	 * @return the double
	 */
	protected abstract double cost();

	/**
	 * Gets description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets size.
	 *
	 * @return the size
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * Sets size.
	 *
	 * @param size the size
	 */
	public void setSize(Size size) {
		this.size = size;
	}
}
