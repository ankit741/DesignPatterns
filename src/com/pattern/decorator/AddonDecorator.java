package com.pattern.decorator;

/**
 * The type Addon decorator.
 * @author ankitsir
 */
public abstract class AddonDecorator extends Beverage {

	protected  Beverage beverage;

	@Override
	public abstract String getDescription();

	@Override
	public Size getSize(){
		return beverage.getSize();
	}

}
