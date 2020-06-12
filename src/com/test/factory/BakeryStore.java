package com.test.factory;

public class BakeryStore {

	public Cake orderCake(String type) {
		Cake cake = null;

		cake = CakeFactory.createCake(type);
		cake.prepareCake();
		cake.decorateCake();

		return cake;
	}
}
