package com.pattern.decorator;

/**
 * @author ankitsir
 */
public class MilkDecorator extends AddonDecorator {
	public MilkDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	protected double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.LARGE) {
			cost += 5.5;
		} else if (beverage.getSize() == Size.MEDIUM) {
			cost += 1.5;
		} else if (beverage.getSize() == Size.SMALL) {
			cost+=1.0;
		}
		return cost;
	}

	@Override
	public String getDescription() {
			return beverage.getDescription() + ", With Milk";
	}
}
