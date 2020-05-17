package com.pattern.factory;

/**
 * The type Pizza.
 */
public abstract class Pizza {

	/**
	 * Prepare.
	 */
	void prepare(){
		System.out.println("preparing pizza.");
	}

	/**
	 * Cut.
	 */
	void cut(){
		System.out.println("cutting pizza.");
	}

	/**
	 * Box.
	 */
	void box(){
		System.out.println("boxing pizza.");
	}

	/**
	 * Bake.
	 */
	void bake(){
		System.out.println("baking pizza.");
	}

}
