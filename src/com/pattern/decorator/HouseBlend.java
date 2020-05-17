package com.pattern.decorator;

/**
 * The type House blend.
 * @author ankitsir
 */
public class HouseBlend extends Beverage{

	public HouseBlend() {
		description="HouseBlend Coffee";
	}

	@Override
	protected double cost() {
		return 120.0;
	}
}
