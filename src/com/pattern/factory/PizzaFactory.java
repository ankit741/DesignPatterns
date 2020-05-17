package com.pattern.factory;

/**
 * The type Pizza factory.
 */
public class PizzaFactory {


	/**
	 * Create pizza pizza.
	 *
	 * @param type the type
	 * @return the pizza
	 */
	public  Pizza createPizza(PizzaTypes type) {
		Pizza pizza=null;
		switch (type) {
		case CHEEZE:
			pizza= new CheesePizza();
			break;
		case VEGGIE:
			pizza= new VeggiePizza();
			break;
		default:
			throw new RuntimeException("Not a valid Pizza type.");
		}
		return pizza;
	}
}
