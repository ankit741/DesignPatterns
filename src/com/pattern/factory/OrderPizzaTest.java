package com.pattern.factory;

public class OrderPizzaTest {
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		store.setPizzaFactory(new PizzaFactory());
		store.order(PizzaTypes.CHEEZE);
		store.order(PizzaTypes.VEGGIE);
	}
}
