package com.test.factory;

public class CrunchyButterscotchCake implements Cake {

	@Override
	public void prepareCake() {
		System.out.println("Preparing Crunchy Butter Scotch Cake.....");
	}

	@Override
	public void decorateCake() {
		System.out.println("Decorating Crunchy Butter Scotch Cake.....");
	}
}
