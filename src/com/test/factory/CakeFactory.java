package com.test.factory;

public class CakeFactory {

	public static Cake createCake(String type) {
		Cake cake = null;

		if (type.equalsIgnoreCase("normal")) {
			cake = new NormalCake();
		} else if (type.equalsIgnoreCase("butter")) {
			cake = new CrunchyButterscotchCake();
		} else if (type.equalsIgnoreCase("chocolate")) {
			cake = new ChocolateCake();
		}
		return cake;
	}
}
