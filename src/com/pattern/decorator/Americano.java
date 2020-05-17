package com.pattern.decorator;

/**
 * The type Americano.
 * @author ankitsir
 */
public class Americano extends Beverage {

	public Americano() {
		description="Americano Coffee";
	}

	@Override
	protected double cost() {
		return 150.0;
	}
}
