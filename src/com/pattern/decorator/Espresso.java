package com.pattern.decorator;

/**
 * The type Espresso.
 * @author ankitsir
 */
public class Espresso extends Beverage{
	public Espresso() {
		description="Espresso Coffee";
	}

	@Override
	protected double cost() {
		return 100.0;
	}
}
