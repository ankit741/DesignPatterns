package com.pattern.factory;


public class VeggiePizza extends Pizza {
	@Override
	void prepare() {
		System.out.println("prepare :: Veggie piza");
	}

	@Override
	void cut() {
		System.out.println("cut :: Veggie piza");
	}

	@Override
	void box() {
		System.out.println("box :: Veggie piza");
	}

	@Override
	void bake() {
		System.out.println("bake :: Veggie piza");
	}
}
