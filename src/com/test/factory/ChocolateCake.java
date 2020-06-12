package com.test.factory;

public class ChocolateCake implements Cake {

	@Override
	public void prepareCake() {
		System.out.println("Preparing Chocolate Cake.....");
	}

	@Override
	public void decorateCake() {
		System.out.println("Decorating Chocolate Cake.....");
	}
}
