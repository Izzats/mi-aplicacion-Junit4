package com.ejemplo;

public class Calculator {

	public static int factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Número debe ser no negativo");
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;

	}
}
