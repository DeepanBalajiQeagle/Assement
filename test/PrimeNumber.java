package org.qeagle.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		int rem = 0, flag = 0;
		rem = input / 2;
		for (int i = 2; i < rem; i++) {
			
			if (input % i == 0) {
				System.out.println(input);
				System.out.println("Its is not a prime number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Its is a prime number");
		}

	}
}
