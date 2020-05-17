package com.pattern.decorator;

/**
 * The type Mocha decorator.
 * @author ankitsir
 */
public class MochaDecorator extends AddonDecorator {

	/**
	 * Instantiates a new Mocha decorator.
	 *
	 * @param beverage the beverage
	 */
	public MochaDecorator(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	protected double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.LARGE) {
			cost += 1.5;
		} else if (beverage.getSize() == Size.MEDIUM) {
			cost += 1.0;
		} else if (beverage.getSize() == Size.SMALL) {
			cost+=0.5;
		}
		return cost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", With Mocha";
	}

}
