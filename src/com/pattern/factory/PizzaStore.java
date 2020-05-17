package com.pattern.factory;

/**
 * The type Order pizza.
 */
public class PizzaStore {

	/**
	 * The Pizza factory.
	 */
	PizzaFactory pizzaFactory;

	/**
	 * Order.
	 *
	 * @param type the type
	 */
	public void order(PizzaTypes type) {
		Pizza pizza = pizzaFactory.createPizza(type);
		pizza.bake();
		pizza.prepare();
		pizza.cut();
		pizza.box();
	}

	/**
	 * Sets pizza factory.
	 *
	 * @param pizzaFactory the pizza factory
	 */
	public void setPizzaFactory(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
}
