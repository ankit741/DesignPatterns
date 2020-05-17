package com.pattern.decorator;

import com.pattern.decorator.Beverage.Size;

/**
 * @author ankitsir
 */
public class StarCoffeeShop {

	public static void main(String[] args) {

		Beverage beverage=new Espresso();
		beverage.setSize(Size.MEDIUM);
		System.out.println(beverage.getDescription()
				+ " $" + String.format("%.2f", beverage.cost()));
		beverage = new MochaDecorator(beverage);
		System.out.println(beverage.getDescription()
				+ " $" + String.format("%.2f", beverage.cost()));
		beverage=new MilkDecorator(beverage);
		System.out.println(beverage.getDescription()
				+ " $" + String.format("%.2f", beverage.cost()));
	}
}
