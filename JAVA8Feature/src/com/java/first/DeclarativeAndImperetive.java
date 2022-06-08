package com.java.first;

import java.util.stream.IntStream;

public class DeclarativeAndImperetive {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;

		}
		System.out.println("sum =" + sum);

		int sum2 = IntStream.rangeClosed(0, 100).sum();
		System.out.println("sum2 =" + sum2);

	}
}
