package com.test.factory;

import java.util.Scanner;

public class FactoryPatternTest {

	public static void main(String[] args) {

		CakeFactory cf = new CakeFactory();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of cake: ");
		String name = sc.next();

		Cake cake = cf.createCake(name);
		cake.prepareCake();
		cake.decorateCake();
	}
}
