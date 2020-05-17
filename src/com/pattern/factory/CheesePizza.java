package com.pattern.factory;


/**
 * @author ankitsir
 */

public class CheesePizza extends Pizza{
	@Override
	void prepare() {
		System.out.println("prepare :: Cheeze piza");
	}

	@Override
	void cut() {
		System.out.println("cut :: Cheeze piza");
	}

	@Override
	void box() {
		System.out.println("box :: Cheeze piza");
	}

	@Override
	void bake() {
		System.out.println("bake :: Cheeze piza");
	}
}
