package com.test.factory;

public class NormalCake implements Cake {

	@Override
	public void prepareCake() {
		System.out.println("Preparing Normal Cake.....");
	}

	@Override
	public void decorateCake() {
		System.out.println("Decorating Normal Cake.....");
	}
}
