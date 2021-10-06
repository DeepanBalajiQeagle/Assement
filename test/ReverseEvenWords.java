package org.qeagle.test;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] sc = test.split(" ");
		for (int i = sc.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println("Its is a Even words:"+sc[i]);
			} else {
				System.err.println("Its is Odd Words:"+sc[i]);
			}
		}
	}
}
