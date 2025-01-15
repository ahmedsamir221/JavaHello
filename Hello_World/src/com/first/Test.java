package com.first;

public class Test {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 };

		int sum = 0;
		int x = 55;

		for (int num : numbers) {
			sum += num + 1;
		}

		System.out.println(sum);

	}

}
